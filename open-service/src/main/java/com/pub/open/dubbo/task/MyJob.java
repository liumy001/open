package com.pub.open.dubbo.task;

import com.pub.open.commons.util.RedisUtil;

import javax.annotation.Resource;

/**
 * Created by liumy on 2016/7/24.
 */
public class MyJob {

    @Resource(name = "redisUtil")
    public RedisUtil redisUtil;

    public void work() {
        int i = 0;
        redisUtil.pushQueue("test_key", i++ + "");
        System.out.println("长度：" + redisUtil.length("test_key"));
    }

}
