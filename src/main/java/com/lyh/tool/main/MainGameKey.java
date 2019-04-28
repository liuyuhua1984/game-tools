package com.lyh.tool.main;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Properties;

/**
 * 设置生成游戏key值
 *
 * @author: root
 * @create: 2018-10-08 14:53
 **/

public class MainGameKey {
    /**
     * res路径
     **/
    public static String RES = "/res/";

    public static void main(String arg[]) {

        try {
            String userPath = System.getProperty("user.dir");
            String filePath = "game.properties";

            if (arg != null && arg.length > 0) {
                userPath = arg[0];
                filePath = arg[1];
            }

            Properties properties = GameProperties.loadGameProperties(userPath+RES+filePath);

            String key = properties.getProperty("key");
            int days =  Integer.parseInt(properties.getProperty("day"));

            Calendar today = Calendar.getInstance();
            today.add(Calendar.DAY_OF_YEAR,days);
            today.set(Calendar.HOUR,0);
            today.set(Calendar.MINUTE,0);
            today.set(Calendar.SECOND,0);
            today.set(Calendar.MILLISECOND,0);
            String tm = ""+today.getTimeInMillis();
            String md5Days = Md5Encrypt.getMD5(tm+key);

            File file = new File(userPath+RES+"game-key.dat");

            FileOutputStream fileOutputStream = new FileOutputStream(file);
            //创建字节流缓冲区，加快写出速度
            //  BufferedOutputStream bout=new BufferedOutputStream(fileOutputStream);

            //创建字符输出流对象
            // BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(bout, "utf-8"));
            //    FileWriter fileWriter = new FileWriter(userPath+RES+"admin.dat");

            if (tm != null){
                byte[] data = tm.getBytes("utf-8");
                // int index = 0;
                for (int i = 0; i < data.length; i++){
                    data[i] ^=1;
                }

                fileOutputStream.write(data);
                fileOutputStream.write("\r\n".getBytes("UTF-8"));
            }

            if (md5Days != null) {
                byte[] data = md5Days.getBytes("utf-8");
                // int index = 0;
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

            fileOutputStream.flush();
            fileOutputStream.close();

        }catch (Exception e){
            e.printStackTrace();
            System.exit(0);
        }
    }
}
