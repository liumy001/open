package com.pub.open.commons.util;


import com.pub.open.entity.MailInfo;

public class emailTest {

	 public static void main(String[] args) {  
	        MailInfo mailInfo = new MailInfo();
	        mailInfo.setMailServerHost("smtp.163.com");  
	        mailInfo.setMailServerPort("25");  
	        mailInfo.setValidate(true);  
	        mailInfo.setUsername("liumingyue0203@163.com");  
	        mailInfo.setPassword("l111111");// 您的邮箱密码  
	        mailInfo.setFromAddress("liumingyue0203@163.com");  
	        mailInfo.setToAddress("407231704@qq.com");  
	        mailInfo.setSubject("设置邮箱标题");  
	                  
	        //附件  
	        String[] attachFileNames={"d:/Sunset.jpg"};  
	        mailInfo.setAttachFileNames(attachFileNames);  
	          
	        // 这个类主要来发送邮件  
	        //mailInfo.setContent("设置邮箱内容");  
	        //SimpleMail.sendTextMail(mailInfo);// 发送文体格式  
	        StringBuffer demo = new StringBuffer();  
	        demo.append("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">")  
	        .append("<html>")  
	        .append("<head>")  
	        .append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">")  
	        .append("<title>测试邮件</title>")  
	        .append("<style type=\"text/css\">")  
	        .append(".test{font-family:\"Microsoft Yahei\";font-size: 18px;color: red;}")  
	        .append("</style>")  
	        .append("</head>")  
	        .append("<body>")  
	        .append("<span class=\"test\">大家好，这里是测试Demo</span>")  
	        .append("</body>")  
	        .append("</html>");  
	         mailInfo.setContent(demo.toString());
	        /*System.out.println(SimpleMail.sendHtmlMail(mailInfo));*/
	    }  
	
}
