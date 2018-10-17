package com.lyh.tool.main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * red
 *
 * @author: root
 * @create: 2018-10-11 14:39
 **/

public class Reader {
    /**res路径**/
    public static String RES = "/res/";
    public static void main(String arg[]) {
        String userPath = System.getProperty("user.dir");
        String filePath = "server-admin.2018-10-12.0.log";

        try {
            FileInputStream fis = new FileInputStream(userPath+RES+filePath);
            BufferedInputStream bout=new BufferedInputStream(fis);

            //创建字符输出流对象
             BufferedReader br =new BufferedReader(new InputStreamReader(bout, "utf-8"));
            FileWriter fw = new FileWriter(userPath+RES+"td.log");
            String data = null;
            List<String> list = new ArrayList<>();
            while ((data = br.readLine()) != null) {
               if (data.contains("888053")){
                   //list.add(data);
                   fw.write(data);
                   fw.write("\r\n");
               }
            }

            br.close();
            fw.close();
            System.err.println("完成!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
