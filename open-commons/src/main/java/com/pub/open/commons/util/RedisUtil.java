package com.pub.open.commons.util;

import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by liumy on 2016/7/24.
 */
@Component(value = "redisUtil")
public class RedisUtil {

    @Resource(name = "redisTemplate")
    private  RedisTemplate stringRedisTemplate;


    private RedisUtil(){

    }




    /**
     * 删除key
     *
     * @param key
     */
    public  void deleteKey(String key) {
        try {
            stringRedisTemplate.delete(key);
        } catch (Exception e) {

        }
    }

    /**
     * 更新key过期时间
     * @param key
     */
    public  Boolean updateKeyExpire(String key, Integer timeOut) {
        try {
            return stringRedisTemplate.expire(key, timeOut, TimeUnit.MINUTES);
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 获取key内容
     *
     * @param key
     */
    public  String getKeyContent(String key) {
        try {
            BoundValueOperations<String, String> stringStringBoundValueOperations = stringRedisTemplate.boundValueOps(key);
            return stringStringBoundValueOperations.get();
        } catch (Exception e) {

        }
        return null;
    }

    /**
     * 设置key内容f
     *
     * @param key
     */
    public  void setKeyContent(String key, String content) {
        try {
            BoundValueOperations<String, String> stringStringBoundValueOperations = stringRedisTemplate.boundValueOps(key);
            stringStringBoundValueOperations.set(content);
        } catch (Exception e) {

        }
    }

    /**
     * 批量删除key
     *
     * @param pattern
     */
    public  void deleteKeyByPattern(String pattern) {
        Set<String> keys = stringRedisTemplate.keys(pattern);
        if (!keys.isEmpty()) {
            stringRedisTemplate.delete(keys);
        }
    }


    public void set(String key,Object value){
        //ValueOperations 理解成Map<Object,Object>


//        redisTemplate.opsForValue().set("redis-key","I'm test spring-data-redis");
        ValueOperations valueOperations = stringRedisTemplate.opsForValue();
        valueOperations.set(key,value);


        //BoundValueOperations的理解对保存的值做一些细微的操作
//        BoundValueOperations boundValueOperations = redisTemplate.boundValueOps(key);
    }
    public  Object get(String key){
        return stringRedisTemplate.opsForValue().get(key);
    }
    public  void setList(String key ,List<?> value){
        //ListOperations可以理解为List<Object>
        ListOperations listOperations= stringRedisTemplate.opsForList();
        listOperations.leftPush(key, value);
//                .leftPushAll(value);
    }
    public  Object getList(String key){
        //ListOperations可以理解为List<Object>
        return stringRedisTemplate.opsForList().leftPop(key);
    }
    public   void setSet(String key ,Set<?> value){
        SetOperations setOperations= stringRedisTemplate.opsForSet();
        setOperations.add(key, value);
    }
    public  Object getSet(String key){
        return stringRedisTemplate.opsForSet().members(key);
    }


    public  void setHash(String key ,Map<String,?> value){
        HashOperations hashOperations = stringRedisTemplate.opsForHash();
        hashOperations.putAll(key, value);
    }
    public  Object getHash(String key){
        return stringRedisTemplate.opsForHash().entries(key);
    }


    public   void delete(String key){
        stringRedisTemplate.delete(key);
    }
    public  void clearAll(){
        stringRedisTemplate.multi();
    }

    /**
     * 压栈
     *
     * @param key
     * @param value
     * @return
     */
    public Long pushStack(String key, String value) {
        return stringRedisTemplate.opsForList().leftPush(key, value);
    }

    /**
     * 出栈
     *
     * @param key
     * @return
     */
    public  String popStack(String key) {
        return (String)stringRedisTemplate.opsForList().leftPop(key);
    }

    /**
     * 入队
     *
     * @param key
     * @param value
     * @return
     */
    public  Long pushQueue(String key, String value) {
       try {
           if (stringRedisTemplate==null)
           {
               System.out.println("redis实例为null:");
                new Exception("redis实例为null:");
           }
           return stringRedisTemplate.opsForList().rightPush(key, value);
       }catch (Exception e){
           e.printStackTrace();
       }
        return  1l;
    }

    /**
     * 出队
     *
     * @param key
     * @return
     */
    public  String popQueue(String key) {
        return (String)stringRedisTemplate.opsForList().leftPop(key);
    }

    /**
     * 栈/队列长
     *
     * @param key
     * @return
     */
    public  Long length(String key) {
        return stringRedisTemplate.opsForList().size(key);
    }

    /**
     * 范围检索
     *
     * @param key
     * @param start
     * @param end
     * @return
     */
    public  List<String> range(String key, int start, int end) {
        return stringRedisTemplate.opsForList().range(key, start, end);
    }

    /**
     * 移除
     *
     * @param key
     * @param i
     * @param value
     */
    public  void remove(String key, long i, String value) {
        stringRedisTemplate.opsForList().remove(key, i, value);
    }

    /**
     * 置值
     *
     * @param key
     * @param index
     * @param value
     */
    public  void set(String key, long index, String value) {
        stringRedisTemplate.opsForList().set(key, index, value);
    }

    /**
     * 裁剪
     *
     * @param key
     * @param start
     * @param end
     */
    public  void trim(String key, long start, int end) {
        stringRedisTemplate.opsForList().trim(key, start, end);
    }

    /**
     * 检索
     *
     * @param key
     * @param index
     * @return
     */
    public  String index(String key, long index) {
        return (String)stringRedisTemplate.opsForList().index(key, index);
    }




    /**
     * @param key
     * @param value
     * @param liveTime
     */
    public void set(final byte[] key, final byte[] value, final long liveTime) {
        stringRedisTemplate.execute(new RedisCallback() {
            public Long doInRedis(RedisConnection connection) throws DataAccessException {
                connection.set(key, value);
                if (liveTime > 0) {
                    connection.expire(key, liveTime);
                }
                return 1L;
            }
        });
    }

    /**
     * @param key
     * @param value
     * @param liveTime
     */
    public void set(String key, String value, long liveTime) {
        this.set(key.getBytes(), value.getBytes(), liveTime);
    }


    /**
     * @param key
     * @param value
     */
    public void set(String key, String value) {
        this.set(key, value, 0L);
    }

    /**
     * @param key
     * @param value
     */
    public  void set(byte[] key, byte[] value) {
        this.set(key, value, 0L);
    }



}
