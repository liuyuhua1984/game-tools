package com.lyh.tool.main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * red
 *
 * @author: root
 * @create: 2018-10-11 14:39
 **/

public class EncryptM3u8 {
    /**res路径**/
    public static String RES = "/res/";
    public static void main(String arg[]) {
        String userPath = System.getProperty("user.dir");
        String filePath = "enc.key";

        try {
            FileInputStream fis = new FileInputStream(userPath+RES+filePath);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte data []  = new byte [1024];
            int len = 0;
            while ((len=fis.read(data,0,data.length)) > 0) {
                byteArrayOutputStream.write(data,0,len);
            }


            byte lastData[] = byteArrayOutputStream.toByteArray();
            int i= 1;
            for (int j = 0; j < lastData.length; j++){
                lastData[j] =(byte) (lastData[j] ^i);
                i++;
                if (i == 0xff){
                    i=1;
                }
            }

            byteArrayOutputStream.close();
            FileOutputStream fileOutputStream = new FileOutputStream(userPath+RES+filePath+".log");
            fileOutputStream.write(lastData);
            fileOutputStream.flush();
            fileOutputStream.close();
//            BufferedInputStream bout=new BufferedInputStream(fis);
//
//            //创建字符输出流对象
//             BufferedReader br =new BufferedReader(new InputStreamReader(bout, "utf-8"));
//            FileWriter fw = new FileWriter(userPath+RES+filePath+File.separator+".log");
//            String data = null;
//            List<String> list = new ArrayList<String>();
//            while ((data = br.readLine()) != null) {
//               if (data.contains("106.47.237.42") || data.contains("42.90.114.98") || data.contains("49.95.108.117") || data.contains("222.217.218.183")
//                       ||data.contains("125.95.97.147") ||data.contains("117.176.57.224") || data.contains("888025")  ){
//                   //list.add(data);
//                   fw.write(data);
//                   fw.write("\r\n");
//               }
//            }


            System.err.println("m3u8解析完成!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
