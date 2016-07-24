package com.pub.open.dubbo.proxy;

import com.alibaba.fastjson.JSONObject;
import com.pub.open.api.commons.CommonService;
import com.pub.open.commons.constant.ConstProperty;
import com.pub.open.commons.util.PropertyUtil;
import com.pub.open.commons.util.SimpleMail;
import com.pub.open.dubbo.CommonProcess;
import com.pub.open.entity.MailInfo;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by liumy on 2016/7/23.
 */
@Component(value = "common.pubservice")
public class CommonServiceProxy implements CommonService {


    @Resource(name = "simpleMail")
    private SimpleMail simpleMail;

    @Resource(name = "service.commonProcess")
    private CommonProcess commonProcess;

    @Override
    public String sayHello(String content) {
        System.out.print(content);
       return  content;
    }

    /**
     * mailInfo.setMailServerHost("smtp.163.com");
     mailInfo.setMailServerPort("25");
     mailInfo.setValidate(true);
     mailInfo.setUsername("liumingyue0203@163.com");
     mailInfo.setPassword("l111111");// 您的邮箱密码
     mailInfo.setFromAddress("liumingyue0203@163.com");
     mailInfo.setToAddress("407231704@qq.com");
     mailInfo.setSubject("设置邮箱标题");
     * @param mailInfo
     * @return
     */
    @Override
    public String sendTextMail(MailInfo mailInfo) {

        JSONObject jsonObject=new JSONObject();

        if(commonProcess.checkMailInfo(mailInfo)==null){
            jsonObject.put("msg","邮件vo为空");
            jsonObject.put("code","1112");
            return jsonObject.toString();
        }
        simpleMail.sendTextMail(mailInfo);
        jsonObject.put("msg", "发送成功");
        jsonObject.put("code","0000");
        System.out.println(mailInfo.toString() + "|" + jsonObject.toString());
        return jsonObject.toString();
    }

    @Override
    public String sendHtmlMail(MailInfo mailInfo) {
        JSONObject jsonObject=new JSONObject();
        if(commonProcess.checkMailInfo(mailInfo)==null){
            jsonObject.put("msg","邮件vo为空");
            jsonObject.put("code","1112");
            return jsonObject.toString();
        }
        System.out.println(mailInfo.toString());
        simpleMail.sendHtmlMail(mailInfo);
        System.out.println(mailInfo.toString());
        jsonObject.put("msg", "发送成功");
        jsonObject.put("code", "0000");
        System.out.println(mailInfo.toString()+"|"+jsonObject.toJSONString());
        return jsonObject.toString();
    }
}
