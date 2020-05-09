package com.lyh.tools.key;

import com.alibaba.fastjson.JSON;
import com.lyh.tools.conf.ServerGameConfig;
import com.lyh.tools.entity.TitleData;
import com.lyh.tools.utils.ToolUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.math.BigDecimal;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author lyh
 * @CLASSNAME KeyManager
 * @description key处理类
 * @date 2020/5/9
 **/
public class KeyManager {

    private static ConcurrentHashMap<String, String> nkeyMap = new ConcurrentHashMap<String, String>();

    private static final Logger logger = LoggerFactory.getLogger(KeyManager.class);

    /**
     * 读取文件
     */
    public static void readNkeyFile() {
        FileInputStream fis = null;
        File file = null;
        try {
            file = new File(ServerGameConfig.KEY_SAVE_PATH + File.separator + "nKey.txt");
            if (!file.exists()) {
                logger.error("nKey路径有问题::{}", ServerGameConfig.KEY_SAVE_PATH);
                return;
            }
            fis = new FileInputStream(file);
            BufferedInputStream bout = new BufferedInputStream(fis);
            //创建字符输出流对象
            BufferedReader br = new BufferedReader(new InputStreamReader(bout, "utf-8"));
            String line = null;
            while ((line = br.readLine()) != null) {
                //                File sfile = new File(line.trim());
                //                if (sfile.isFile()) {
                //                    sfile.delete();
                //                }
                String z[] = line.split("=");
                String index = new String(z[z.length - 1]);
                String key = "";
                for (int i = 0; i < z.length - 1; i++) {
                    key += z[i];
                    if (i != z.length - 2) {
                        key += "=";
                    }
                }
                logger.error("nKeyMap:{}", line);
                nkeyMap.put(key, index);

                //                zoneIndex = index > zoneIndex ? index : zoneIndex;

            }

            br.close();
            bout.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("读取失败文件有问题:", e);
        } finally {
            //            if (file != null && file.isFile() && file.exists()) {
            //                file.delete();
            //            }
        }
    }

    /**
     * 写nKey
     * 功能描述
     *
     * @param *  @param distPath
     * @param Id
     * @return
     * @author lyh
     * @date
     */
    public static void writeNKey(String distPath, String Id) {
        try {

            String nkeyVal = nkeyMap.get(Id);
            if (nkeyVal != null) {
                logger.error("存nkey有问题{}", Id);
                return;
            }

            nkeyMap.put(Id, Id);

            File file = new File(ServerGameConfig.KEY_SAVE_PATH + File.separator + "nKey.txt");
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }

            BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "UTF-8"));

            // FileWriter fw = new FileWriter(file, true);
            fw.write(Id + "=" + Id);
            fw.write("\r\n");
            fw.flush();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
            logger.error(distPath, e);
        }
    }


    public static void doKey() {
        readNkeyFile();
        readSrcKey(ServerGameConfig.KEY_SRC_PATH + File.separator);
    }

    /**
     * 读取title
     * 功能描述
     *
     * @param * @param titlePath
     * @return
     * @author lyh
     * @date
     */
    public static TitleData readTitle(String titlePath) {
        FileInputStream fileInputStream = null;
        ByteArrayOutputStream baos = null;
        try {
            fileInputStream = new FileInputStream(titlePath);
            byte data[] = new byte[1024];
            int len = -1;
            baos = new ByteArrayOutputStream();

            while ((len = fileInputStream.read(data, 0, data.length)) != -1) {
                baos.write(data, 0, len);
            }
            String content = new String(baos.toByteArray(), "UTF-8");
            TitleData title = JSON.parseObject(content, TitleData.class);

            return title;

        } catch (Exception e) {
            e.printStackTrace();
            logger.error("文件异常", e);
        } finally {
            if (baos != null) {
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return null;
    }


    public static byte[] readKey(String titlePath) {
        FileInputStream fileInputStream = null;
        ByteArrayOutputStream baos = null;
        try {
            fileInputStream = new FileInputStream(titlePath);
            byte data[] = new byte[1024];
            int len = -1;
            baos = new ByteArrayOutputStream();

            while ((len = fileInputStream.read(data, 0, data.length)) != -1) {
                baos.write(data, 0, len);
            }

            return baos.toByteArray();

        } catch (Exception e) {
            e.printStackTrace();
            logger.error("文件异常", e);
        } finally {
            if (baos != null) {
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return null;
    }

    public static void readSrcKey(String keySrcPath) {
        File file = new File(keySrcPath);
        if (!file.exists()) {
            logger.error("key目录不存在={}", keySrcPath);
            return;
        }

        if (file.isFile()) {
            logger.error("需要的是目录={}", keySrcPath);
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
                //                            encryptFile(file2, distFolder, key);
                readSrcKey(file2.getPath());
            } else {
                if (file2.getName().endsWith(ServerGameConfig.SUFFIX_KEY)) {

                    FileInputStream fis = null;
                    BufferedInputStream bout = null;
                    BufferedReader br = null;
                    try {

                        //读取title.txt
                        TitleData titleData = readTitle(file2.getParentFile().getPath()+File.separator+"title.txt");
                        if (titleData == null){
                            logger.error("title为空:{}",file2.getName());
                            continue;
                        }

                        //判断路径是否存在entity
                        //boolean isFile():测试此抽象路径名表示的文件是否是一个标准文件。
                        fis = new FileInputStream(file2);
                        bout = new BufferedInputStream(fis);
                        //创建字符输出流对象
                        br = new BufferedReader(new InputStreamReader(bout, "utf-8"));
                        String line = null;
                        //长短m3u8与长度
                        StringBuilder m3u8Builder = new StringBuilder();
                        StringBuilder shortM3u8Builder = new StringBuilder();
                        long totalVideoTime = 0;//秒
                        int size = 0;//多大
                        String srcM3u8Key = "key.key";
                        while ((line = br.readLine()) != null) {

                            String reg2 = "(https|http)\\:\\/\\/.*\\/";
                            line = line.replaceAll(reg2, "");

                            int tIndex = line.indexOf("URI=");
                            if (tIndex > -1) {
                                String m[] = line.split(",");

                                for (int j = 0; j< m.length; j++) {
                                    String tmp = m[j];
                                    int mIndex = tmp.indexOf("URI=");
                                    if (mIndex > -1) {
                                      String  m3u8Key = tmp.substring(mIndex + 5, tmp.length() - 1);

                                        String key = "key.key";
                                        if (!m3u8Key.startsWith("http") && !m3u8Key.startsWith("https")){
                                            key = m3u8Key;
                                        }
                                        srcM3u8Key = key;
                                        File keyFile = new File(file2.getParentFile().getPath()+File.separator+key);
                                        if (!keyFile.exists() || !keyFile.isFile()){
                                            writeNKey(ServerGameConfig.KEY_SAVE_PATH,""+titleData.getId());
                                        }
                                        logger.error("原key={}", m3u8Key);
                                        m3u8Key = ServerGameConfig.HTTP_KEY_ADDR;
                                        if (!ToolUtils.isStringNull(ServerGameConfig.NEED_ID) && ServerGameConfig.NEED_ID.equals("1")) {
                                            m3u8Key += "?id=" +titleData.getId();
                                        }
                                        m[j] ="URI=" +"\""  +m3u8Key+"\"";
                                        break;
                                    }
                                }

                                StringBuilder sb = new StringBuilder();
                                for (int j = 0; j< m.length; j++) {
                                    sb.append(m[j]);
                                    if (j != m.length-1){
                                        sb.append(",");
                                    }
                                }
                                line = sb.toString();
                            }


//                            String sStr = "#EXTINF:";
//                            if (line.startsWith(sStr)) {//统计时间
//                                String sub = line.substring(8, line.length() - 1);
//                                BigDecimal bigDecimal = new BigDecimal(sub);
//                                BigDecimal two = new BigDecimal(Double.toString(1000000));
//                                totalVideoTime += bigDecimal.multiply(two).longValue();
//                            }

                            m3u8Builder.append(line);
                            m3u8Builder.append("\r\n");
//                            if (totalVideoTime / 1000000 <= 30) {//秒
//                                shortM3u8Builder.append(line);
//                                shortM3u8Builder.append("\r\n");
//                            }

//                            String ts = ".ts";
//                            if (line.endsWith(ts)) {//读取ts文件
//                                File tsFile = new File(m3u8Path + File.separator + line);
//                                if (!tsFile.exists()) {
//                                    return m3;
//                                }
//                                FileInputStream fileInputStream = new FileInputStream(tsFile);
//                                byte[] bs = new byte[1024];
//                                // 读取到的数据长度
//                                int len;
//                                // 输出的文件流
//                                ByteArrayOutputStream baos = new ByteArrayOutputStream();
//                                // 开始读取
//                                while ((len = fileInputStream.read(bs)) != -1) {
//                                    baos.write(bs, 0, len);
//                                }
//                                size += baos.toByteArray().length;
//
//                                // 完毕，关闭所有链接
//                                baos.close();
//                                fileInputStream.close();
//                            }

                        }

                        String mString = m3u8Builder.toString();
//                        String tString = shortM3u8Builder.toString();

                        String endStr = "#EXT-X-ENDLIST";
                        if (!mString.contains(endStr)) {
                            mString += endStr + "\r\n";
                        }

//                        if (!tString.contains(endStr)) {
//                            tString += endStr + "\r\n";
//                        }


                        //存入

                        try {
                            String idPath = "";
                            if (!ToolUtils.isStringNull(ServerGameConfig.NEED_ID) && ServerGameConfig.NEED_ID.equals("1")) {
                                idPath = ""+titleData.getId();
                            }


                            File keyFile = new File(ServerGameConfig.KEY_SAVE_PATH+File.separator+idPath+File.separator+srcM3u8Key);

                            if (!keyFile.getParentFile().exists()){
                                keyFile.getParentFile().mkdirs();
                            }
//                            if (!keyFile.exists()){
//                                keyFile.createNewFile();
//                            }
                            byte data[] = readKey(file2.getParentFile().getPath() + File.separator+srcM3u8Key);
                            BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(keyFile, false), "UTF-8"));

                            fw.write(new String(data,"UTF-8"));
                            fw.flush();
                            fw.close();

                          //  File mu38 = new File(file2.getPath());
//                            if (mu38.exists()){
//                                mu38.delete();
//                            }

                            fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2, false), "UTF-8"));

                            // FileWriter fw = new FileWriter(PropertiesConfig.VIDEO_SRC_FOLDER_PATH+File.separator+m3[0], false);

                            fw.write(mString);
                            fw.flush();
                            fw.close();



                            logger.error("读取key完成{},{}", file2.getName(), srcM3u8Key);
                        } catch (IOException e) {
                            e.printStackTrace();
                            logger.error("m3u8::", e);
                        }

                    } catch (Exception e) {
                        logger.error("m3u8错误::", e);
                    } finally {
                        //            if (file != null && file.isFile() && file.exists()) {
                        //                file.delete();
                        //            }
                        try {
                            if (br != null) {
                                br.close();
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        try {
                            if (bout != null) {
                                bout.close();
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        try {
                            if (fis != null) {
                                fis.close();
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                } else {

                }
            }
        }
    }
}
