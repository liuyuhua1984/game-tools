package com.lyh.tool.main;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 修改字符串
 *
 * @author: root
 * @create: 2019-01-02 13:49
 **/

public class ChangeStringMain {

    /**res路径**/
    public static String RES = "/res/";
    public static void main(String arg[]) {
        String userPath = System.getProperty("user.dir");
        String filePath = "name.txt";

        try {
            FileInputStream fis = new FileInputStream(userPath+RES+filePath);
            BufferedInputStream bout=new BufferedInputStream(fis);

            //创建字符输出流对象
            BufferedReader br =new BufferedReader(new InputStreamReader(bout, "utf-8"));
            FileWriter fw = new FileWriter(userPath+RES+"name-lib.txt");
            String data = null;
            List<String> list = new ArrayList<String>();
            int count = 0;
            while ((data = br.readLine()) != null) {
                data = data.replaceAll("、"," ");
                //if (data.contains("106.47.237.42") || data.contains("42.90.114.98") || data.contains("49.95.108.117") || data.contains("222.217.218.183")
                //        ||data.contains("125.95.97.147") ||data.contains("117.176.57.224") || data.contains("888025")  ){
                //    //list.add(data);
                String t[] =  data.split(" ");
                count+=t.length;
                    fw.write(data);
                    //fw.write("\r\n");
              //  }
            }


            System.out.println("长度::"+count);
            br.close();
            fw.close();
            System.err.println("完成!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
