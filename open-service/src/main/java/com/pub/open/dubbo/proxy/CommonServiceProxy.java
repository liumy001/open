package com.pub.open.dubbo.proxy;

import com.pub.open.api.commons.CommonService;
import org.springframework.stereotype.Component;

/**
 * Created by liumy on 2016/7/23.
 */
@Component(value = "common.pubservice")
public class CommonServiceProxy implements CommonService {
    @Override
    public String sayHello(String content) {
        System.out.print(content);
       return  content;
    }
}
