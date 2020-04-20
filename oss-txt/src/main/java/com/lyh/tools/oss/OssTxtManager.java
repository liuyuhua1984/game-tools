package com.lyh.tools.oss;

import com.lyh.tools.conf.ServerGameConfig;
import com.lyh.tools.utils.binary.Aes256Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * @author lyh
 * @CLASSNAME OssTxtManager
 * @description oss管理类
 * @date 2020/4/20
 **/


public class OssTxtManager {
    private final static Logger logger = LoggerFactory.getLogger(OssTxtManager.class);

    public static void encryptOrDecrypt(){
        File file = new File(ServerGameConfig.OSS_TXT_NAME);
        if (!file.getParentFile().exists() ){
            file.getParentFile().mkdirs();
        }
        if (ServerGameConfig.ENCRYPT.equals("1")){//加密
            String encryptStrin =Aes256Utils.encrypt(ServerGameConfig.OSS_JSON,ServerGameConfig.AES_KEY,ServerGameConfig.AES_IV);
           try {

               FileOutputStream fileOutputStream = new FileOutputStream(ServerGameConfig.OSS_TXT_NAME);
               fileOutputStream.write(encryptStrin.getBytes("UTF-8"));
               fileOutputStream.flush();
               fileOutputStream.close();
               logger.error("oss-txt加密完成={},路径={}",encryptStrin,ServerGameConfig.OSS_TXT_NAME);
           }catch (Exception e){
               logger.error("加密有错误:",e);
           }
        }else{//解密
            try {
                FileInputStream fileInputStream = new FileInputStream(ServerGameConfig.OSS_TXT_NAME);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte data []  = new byte [1024];
                int len = 0;
                while ((len=fileInputStream.read(data,0,data.length)) > 0) {
                    byteArrayOutputStream.write(data,0,len);
                }
                byte bData[] = byteArrayOutputStream.toByteArray();
                String vString = new String(bData,"UTF-8");
                String decryptString = Aes256Utils.decrypt(vString,ServerGameConfig.AES_KEY,ServerGameConfig.AES_IV);
                byteArrayOutputStream.close();
                fileInputStream.close();
                logger.error("oss-txt解密完成={},源路径={}",decryptString,ServerGameConfig.OSS_TXT_NAME);
            } catch (Exception e) {
                e.printStackTrace();
                logger.error("oss-txt解密有问题",e);
            }
        }
    }
}
