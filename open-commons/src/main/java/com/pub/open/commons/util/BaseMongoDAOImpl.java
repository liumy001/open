package com.pub.open.commons.util;

  
  
import java.util.List;  

import javax.annotation.Resource;

import com.pub.open.entity.Pagination;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;  
import org.springframework.data.mongodb.core.query.Update;  

public abstract class BaseMongoDAOImpl<T>{  
  
    protected static final int PAGE_SIZE = 8; 
      
    /** 
     * spring mongodb　集成操作类　 
     */  
    @Resource
    protected MongoTemplate mongoTemplate;  
  
    public List<T> find(Query query,String CollName) {  
        return mongoTemplate.find(query, this.getEntityClass(),CollName);
    }  
  
    public T findOne(Query query,String CollName) { 
        return mongoTemplate.findOne(query, this.getEntityClass(),CollName);
    }  
  
    public boolean update(Query query, Update update,String CollName) {  
        mongoTemplate.findAndModify(query, update, this.getEntityClass(),CollName);
        return true;
    }  
  
    public T save(T entity,String CollName) {  
        mongoTemplate.insert(entity,CollName);
        return entity;  
    }

    public void delete(T t){
        this.mongoTemplate.remove(t);
    }
  
    public T findById(String id, String collectionName) {  
        return mongoTemplate.findById(id, this.getEntityClass(), collectionName);  
    }  
      

      
    public long count(Query query,String collName){  
        return mongoTemplate.count(query, collName);
    }  
      
  
    /** 
     * 获取需要操作的实体类class 
     *  
     * @return 
     */  
    private Class<T> getEntityClass(){  
        return ReflectionUtils.getSuperClassGenricType(getClass());  
    }  
  
//    /** 
//     * 注入mongodbTemplate 
//     *  
//     * @param mongoTemplate 
//     */  
    /**
     * 通过条件查询,查询分页结果
     * 
     * @param pageNo
     * @param pageSize
     * @param query
     * @return
     */
    public Pagination<T> getPage(int pageNo, int pageSize, Query query,String CollName) {
        long totalCount = this.mongoTemplate.count(query, this.getEntityClass());
        Pagination<T> page = new Pagination<T>(pageNo, pageSize, totalCount);
        query.skip(page.getFirstResult());// skip相当于从那条记录开始
        query.limit(pageSize);// 从skip开始,取多少条记录
        List<T> datas = this.find(query,CollName); 
        page.setDatas(datas);
        return page;
    }
    
  
}  