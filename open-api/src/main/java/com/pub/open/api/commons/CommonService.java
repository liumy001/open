package com.pub.open.api.commons;

import com.pub.open.entity.MailInfo;

/**
 * Created by liumy on 2016/7/23.
 */
public interface CommonService {


    String sayHello(String content);

    public  String sendTextMail(MailInfo mailInfo);

    public  String sendHtmlMail(MailInfo mailInfo);

}
