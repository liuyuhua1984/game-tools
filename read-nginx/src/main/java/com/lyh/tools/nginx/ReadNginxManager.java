package com.lyh.tools.nginx;

import com.lyh.tools.conf.ServerGameConfig;
import com.lyh.tools.utils.HttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * @author lyh
 * @CLASSNAME ReadNginxManager
 * @description 读取nginx文件
 * @date 2022/5/19
 **/
public class ReadNginxManager {

    private final static Logger logger = LoggerFactory.getLogger(ReadNginxManager.class);


    public static void  readNginx(String nginxFile){

        File file2 = new File(nginxFile);
        if (!file2.exists()){

            logger.error("没有nginx文件"+nginxFile);
            return;
        }
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
                String[] sTemp = new String [2];
               String sp[] = line.split(" ");
                if (sp.length > 1){
                    int i = 0;
                    for (String t : sp){
                        if (t.length() > 0){
                            sTemp[i++] = t;
                        }

                        if (i >= sTemp.length){
                            break;
                        }
                    }
                }

                if (sTemp.length > 0){
                   String st[] =  sTemp[0].split("\\.");
                   String tm[] = sTemp[1].split("\\:");
                    String nString = "";
                   if (tm.length < 2) {
                        nString = st[0] + "-" + sTemp[1] + "." + st[1] + ".rpm";
                   }else{
                       nString = st[0] + "-" + tm[1] + "." + st[1] + ".rpm";
                   }
                   String downloadUrl = ServerGameConfig.DOWN_URL + nString;
                    boolean keyBret = HttpUtils.downloadFile(downloadUrl, ServerGameConfig.SAVE_PATH +nString, 1500000);
                    if (!keyBret){
                        downloadUrl = ServerGameConfig.UPDATE_URL + nString;
                        keyBret = HttpUtils.downloadFile(downloadUrl, ServerGameConfig.SAVE_PATH +nString, 1500000);
                        if (!keyBret) {

                            downloadUrl = ServerGameConfig.DOWNF_URL + nString;
                            keyBret = HttpUtils.downloadFile(downloadUrl, ServerGameConfig.SAVE_PATH +nString, 1500000);
                            if (!keyBret) {
                                logger.error("下载文件没有完成=" + nString);
                            }
                        }
                    }
                }
              //  line = line.replace(ServerGameConfig.DOMAIN_SRC, ServerGameConfig.DOMAIN_DIST);
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
