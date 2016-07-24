package com.pub.open.dubbo;

import com.pub.open.commons.util.PropertyUtil;
import com.pub.open.entity.MailInfo;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * Created by liumy on 2016/7/24.
 */
@Component(value = "service.commonProcess")
public class CommonProcess {

    public static final Logger LOGGER = LoggerFactory.getLogger(CommonProcess.class);

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
    public MailInfo checkMailInfo(MailInfo mailInfo){

        if(mailInfo==null){
            LOGGER.error("获取邮件Vo为空");
            return  null;
        }

        LOGGER.info("邮件发送地址:"+mailInfo.toString());

        if(StringUtils.isBlank(mailInfo.getMailServerHost())) mailInfo.setMailServerHost(PropertyUtil.getString("mail.host"));

        if(StringUtils.isBlank(mailInfo.getMailServerPort())) mailInfo.setMailServerPort(PropertyUtil.getString("mail.port"));

        if(StringUtils.isBlank(mailInfo.getUsername())) mailInfo.setUsername(PropertyUtil.getString("mail.name"));

        if(StringUtils.isBlank(mailInfo.getPassword())) mailInfo.setPassword(PropertyUtil.getString("mail.pwd"));

        if(StringUtils.isBlank(mailInfo.getFromAddress())) mailInfo.setFromAddress(PropertyUtil.getString("main.fromAddress"));

        return  mailInfo;
    }

}
