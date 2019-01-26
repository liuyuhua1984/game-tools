package com.lyh.tool.main;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/**
 * base64加密
 *
 * @author: root
 * @create: 2018-11-15 16:27
 **/

public class OracleHead {

    /**res路径**/
    public static String RES = "/res/";
    public static void main(String arg[]) {
        String userPath = System.getProperty("user.dir");
        String filePath = "orcl.dmp";

        try {

            RandomAccessFile randomAccessFile = new RandomAccessFile(userPath+RES+filePath,"rw");
           // FileInputStream fis = new FileInputStream(userPath+RES+filePath);
            randomAccessFile.seek(0);

            byte[] byData = new byte[100];
            randomAccessFile.read(byData, 0, 50);
            String charData = new String(byData, 0,byData.length,"gbk");
            charData.split(":V");
            //
            //Regex r = new Regex(":V\d{2}\.\d{2}\.\d{2}");

            System.err.println("完成!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
