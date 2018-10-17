package com.lyh.tool.main;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.util.Properties;

/**
 * 后台账号生成类
 *
 * @author: root
 * @create: 2018-10-08 11:51
 **/

public class MainAdmin {

    /**res路径**/
    public static String RES = "/res/";

    public static void main(String arg[]){

        try {
            String userPath = System.getProperty("user.dir");
            String filePath = "admin.properties";

            if (arg != null && arg.length > 0) {
                userPath = arg[0];
                filePath = arg[1];
            }

            Properties properties = GameProperties.loadGameProperties(userPath+RES+filePath);

            String key = properties.getProperty("key");
            String admin = properties.getProperty("admin");
            String password = properties.getProperty("password");

            String md5String = Md5Encrypt.getMD5(admin+key);
            String md5Password = Md5Encrypt.getMD5(key+password);

            File file = new File(userPath+RES+"admin.dat");
            //file.deleteOnExit();
            //
            //file.createNewFile();

            FileOutputStream fileOutputStream = new FileOutputStream(file);
            //创建字节流缓冲区，加快写出速度
          //  BufferedOutputStream bout=new BufferedOutputStream(fileOutputStream);

            //创建字符输出流对象
           // BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(bout, "utf-8"));
        //    FileWriter fileWriter = new FileWriter(userPath+RES+"admin.dat");
            if (md5String != null) {
                byte[] data = md5String.getBytes("utf-8");
               // int index = 0;
                for (int i = 0; i < data.length; i++){
                    data[i] ^=1;
                }

                fileOutputStream.write(data);

                fileOutputStream.write("\r\n".getBytes("UTF-8"));
            }

            if (md5Password != null){
                byte [] data = md5Password.getBytes("UTF-8");
                for (int i = 0; i < data.length; i++){
                    data[i] ^=1;
                }
                fileOutputStream.write(data);
                fileOutputStream.write("\r\n".getBytes("UTF-8"));
            }

            if (key != null){
                byte [] data = key.getBytes("UTF-8");
                for (int i = 0; i < data.length; i++){
                    data[i] ^=1;
                }
                fileOutputStream.write(data);
                fileOutputStream.write("\r\n".getBytes("UTF-8"));
            }

            if (admin != null){
                byte [] data = admin.getBytes("UTF-8");
                for (int i = 0; i < data.length; i++){
                    data[i] ^=1;
                }
                fileOutputStream.write(data);
                fileOutputStream.write("\r\n".getBytes("UTF-8"));
            }

            if (password != null){
                byte [] data = password.getBytes("UTF-8");
                for (int i = 0; i < data.length; i++){
                    data[i] ^=1;
                }
                fileOutputStream.write(data);
                fileOutputStream.write("\r\n".getBytes("UTF-8"));
            }


            fileOutputStream.flush();
            fileOutputStream.close();


        System.out.println("保存admin成功");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
