package com.lyh.tools.domain;

import com.lyh.tools.conf.ServerGameConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * @author lyh
 * @CLASSNAME DomainManager
 * @description oss管理类
 * @date 2020/4/20
 **/


public class DomainManager {
    private final static Logger logger = LoggerFactory.getLogger(DomainManager.class);


    public static void doFolder(String path) {
        File file = new File(path);
        if (!file.exists()) {
            logger.error("路径有问题柯={}", path);
            return;
        }


        File[] listFiles = file.listFiles();//listFiles方法：返回file路径下所有文件和文件夹的绝对路径
        for (File file2 : listFiles) {
            /*
             * 递归作用：由外到内先一层一层删除里面的文件 再从最内层 反过来删除文件夹
             *    注意：此时的文件夹在上一步的操作之后，里面的文件内容已全部删除
             *         所以每一层的文件夹都是空的  ==》最后就可以直接删除了
             */
            if (file2.isDirectory()) {
                doFolder(file2.getPath());
            } else {
                //m3u8
                if (file2.getName().endsWith(ServerGameConfig.FILE_SUFFIX)) {
                    FileInputStream fis = null;
                    BufferedInputStream bout = null;
                    BufferedReader br = null;
                    StringBuilder sb = new StringBuilder();
                    try {
                        fis = new FileInputStream(file2);

                        bout = new BufferedInputStream(fis);
                        //创建字符输出流对象
                        br = new BufferedReader(new InputStreamReader(bout, "utf-8"));
                        String line = null;
                        while ((line = br.readLine()) != null) {
                            if (file2.getName().equals("player.m3u8")){
                                System.err.println("sssss");
                            }
                            if (line.equals("")){
                                continue;
                            }
                            line = line.replace(ServerGameConfig.DOMAIN_SRC, ServerGameConfig.DOMAIN_DIST);
                            sb.append(line);
                            sb.append("\r\n");
                        }


                        sb.delete(sb.length() - "\r\n".length(), sb.length());

                        BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2, false), "UTF-8"));

                        //  FileWriter fw = new FileWriter(file, true);
                        String st = sb.toString();
                        fw.write(st);

                        fw.flush();
                        fw.close();

                    } catch (Exception e) {
                        e.printStackTrace();
                        logger.error("错误中", e);
                    } finally {
                        if (br != null) {
                            try {
                                br.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }

                        if (bout != null) {
                            try {
                                bout.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        if (fis != null) {
                            try {
                                fis.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }

    }

    public static void doDomain() {
        File file = new File(ServerGameConfig.FOLDER);
        if (!file.exists()) {
            logger.error("路径有问题柯={}", ServerGameConfig.FOLDER);
            return;
        }

        if (file.isDirectory()) {//文件夹
            doFolder(ServerGameConfig.FOLDER);
        } else if (file.isFile()) {//是文件
            //拆分为两块 文件夹和文件
        }

        logger.error("完成!!!!!");
    }
}
