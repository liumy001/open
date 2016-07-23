/**
 * @FileName: AxisWebServiceClient.java
 * @Package com.ziroom.sms.commons.util
 * @author bushujie
 * @created 2015-9-26 下午2:13:19
 * <p/>
 * Copyright 2011-2015 asura
 */
package com.pub.open.commons.util;


import com.asura.framework.base.exception.BusinessException;
import org.apache.axiom.om.OMElement;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;

import javax.xml.namespace.QName;

/**
 * <p>webservice客户端</p>
 *
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author bushujie
 * @since 1.0
 * @version 1.0
 */
public class AxisWebServiceClient {

	/**
	 *
	 * rpc调用webservice接口
	 *
	 * @author bushujie
	 * @created 2015-9-26 下午2:21:56
	 *
	 * @param url 接口地址
	 * @param methodName 方法名称
	 * @param paramObjects 参数集合
	 * @return
	 */
	public static String callWebServiceMethod(String url,String methodName,Object[] paramObjects){
		 RPCServiceClient serviceClient=null;
		 OMElement element=null;
		 String result=null;
		 try {
			  serviceClient = new RPCServiceClient();
		      // 指定调用WebService的URL
		      EndpointReference targetEPR = new EndpointReference(url);
		      Options options = serviceClient.getOptions();
		      //确定目标服务地址
		      options.setTo(targetEPR);
		      //确定调用方法
		      options.setAction("urn:"+methodName);
		      QName qname = new QName("http://quickstart.samples/xsd", methodName);
		      // 调用方法一 传递参数，调用服务，获取服务返回结果集
			  element = serviceClient.invokeBlocking(qname, paramObjects);
			  //获取返回值
		      result = element.getFirstElement().getText();
		      // 必须释放资源否则出错
		      serviceClient.cleanupTransport();
		  }catch (Exception e) {
			 throw new BusinessException("webservice调用异常："+methodName,e);
		  }
		  return result;
	}

}
