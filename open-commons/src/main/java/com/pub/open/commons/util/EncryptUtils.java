package com.pub.open.commons.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;

public class EncryptUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(EncryptUtils.class);
    private static char HEXDIGITS[] = {'0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /**
     * MD5加密
     *
     * @param password
     * @return
     */
    public static String getAfterMD5(String password) {
        String afterMD5 = new String();
        try {
            byte[] strTemp = password.getBytes();
            MessageDigest mdTemp = MessageDigest.getInstance("MD5");
            mdTemp.update(strTemp);
            byte[] md = mdTemp.digest();
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = HEXDIGITS[byte0 >>> 4 & 0xf];
                str[k++] = HEXDIGITS[byte0 & 0xf];
            }
            afterMD5 = new String(str);
        } catch (Exception e) {
            if (LOGGER.isErrorEnabled()) {
                LOGGER.error("md5 encrypt error:{} ", e);
            }
            return null;
        }
        return afterMD5;
    }

}
