package com.lyh.img.tools;
import ch.qos.logback.core.joran.spi.JoranException;
import com.lyh.img.tools.GameProperties;
import com.lyh.img.tools.XmlUtils;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import java.util.List;
import java.util.Properties;

/**
 * @author lyh
 * @CLASSNAME EncryptMain
 * @description 图片解密主类
 * @date
 **/
public class EncryptMain {

   public static String userPath = System.getProperty("user.dir");
   private static Logger logger = LoggerFactory.getLogger(EncryptMain.class);
    /**
     * res路径
     **/
    public static String RES = userPath+File.separator+"res"+File.separator;

    public static void main(String arg[]) {

        String filePath = "encrypt.properties";

        try {
            configLogBack("logs");
            Properties properties = GameProperties.loadGameProperties(RES+ filePath);
            Long key = Long.parseLong(properties.getProperty("key"));
            String srcFolderName = properties.getProperty("src_folder_name");
            String distFolderName = properties.getProperty("dist_folder_name");
            String encrypt = properties.getProperty("encrypt");
            if (ToolUtils.isStringNull(srcFolderName)) {
                srcFolderName = "imgs";
            }

            if (ToolUtils.isStringNull(distFolderName)) {
                distFolderName = "dist";
            }


            //            if (ToolUtils.isStringNull(key)){
            //                key = "147258369";
            //            }


//            File srcFolder = new File(userPath+RES+srcFolderName);
//            File distFolder = new File(distFolderName);

            File srcFolder = new File(userPath+File.separator+srcFolderName);
            File distFolder = new File(userPath+File.separator+distFolderName);

            if (srcFolder.isFile()) {
                return;
            }
            if (ToolUtils.isStringNull(encrypt) || encrypt.equalsIgnoreCase("0")){
                decodeFile(distFolder,srcFolder,distFolderName,key);
            }else{
                encryptFile(srcFolder,distFolder,srcFolderName,key);
            }


            //decodeFile(distFolder,srcFolder,key);
//
//            FileInputStream fis = new FileInputStream(userPath + RES + filePath);
//            BufferedInputStream bout = new BufferedInputStream(fis);
//
//            //创建字符输出流对象
//            BufferedReader br = new BufferedReader(new InputStreamReader(bout, "utf-8"));
//            FileWriter fw = new FileWriter(userPath + RES + "td.log");
//            String data = null;
//            List<String> list = new ArrayList<String>();
//            while ((data = br.readLine()) != null) {
//                if (data.contains("106.47.237.42") || data.contains("42.90.114.98") || data.contains("49.95.108.117") || data.contains("222.217.218.183") || data.contains("125.95.97.147") || data.contains("117.176.57.224") || data.contains("888025")) {
//                    //list.add(data);
//                    fw.write(data);
//                    fw.write("\r\n");
//                }
//            }
//
//            br.close();
//            fw.close();
            System.err.println("完成!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void encryptFile(File srcFolder, File distFolder,String srcPath, Long key) {
        if (srcFolder.exists()) {//判断路径是否存在
            if (srcFolder.isFile()) {//boolean isFile():测试此抽象路径名表示的文件是否是一个标准文件。

            } else {//不是文件，对于文件夹的操作
                //保存 路径D:/1/新建文件夹2  下的所有的文件和文件夹到listFiles数组中
                File[] listFiles = srcFolder.listFiles();//listFiles方法：返回file路径下所有文件和文件夹的绝对路径
                for (File file2 : listFiles) {
                    /*
                     * 递归作用：由外到内先一层一层删除里面的文件 再从最内层 反过来删除文件夹
                     *    注意：此时的文件夹在上一步的操作之后，里面的文件内容已全部删除
                     *         所以每一层的文件夹都是空的  ==》最后就可以直接删除了
                     */
                    if (file2.isDirectory()) {
                        encryptFile(file2, distFolder,srcPath, key);
                    } else {
                        //处理
                        if (!(file2.getName().endsWith(".png") || file2.getName().endsWith(".jpg") || file2.getName().endsWith(".jpeg")) ){
                            continue;
                        }
                        String distPath = file2.getPath().replace(srcPath, distFolder.getName());
                        String distPathName = distPath.substring(0,distPath.indexOf(".")+1)+"x";

                        ByteArrayOutputStream byteArrayOutputStream = null;
                        FileInputStream fis = null;
                        FileOutputStream fileOutputStream = null;
                        try {

                            byteArrayOutputStream = new ByteArrayOutputStream();

                            fis = new FileInputStream(file2);
                            byte[] buf = new byte[1024];
                            int length = 0;
                            //循环读取文件内容，输入流中将最多buf.length个字节的数据读入一个buf数组中,返回类型是读取到的字节数。
                            //当文件读取到结尾时返回 -1,循环结束。
                            while ((length = fis.read(buf)) != -1) {
                                byteArrayOutputStream.write(buf, 0, length);
                            }

                            int index = 0;
                            byte data[] = byteArrayOutputStream.toByteArray();
                            for (int i = 0; i < 100; i++) {
                                if (i >= data.length) {
                                    break;
                                }
                                data[i] = (byte) (data[i] ^ key);
                            }

                            //                             ByteArrayInputStream bais = new ByteArrayInputStream(fis);
                            File distFile = new File(distPathName);
//                            distFile.deleteOnExit();
                            if(!distFile.getParentFile().exists()){
                                distFile.getParentFile().mkdirs();
                            }
                            fileOutputStream = new FileOutputStream(distPathName);
                            fileOutputStream.write(data);

                            fileOutputStream.flush();
                            logger.error("加密成功::"+distPathName);
                        } catch (Exception e) {
                            logger.error("加密::"+e);
                        } finally {
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
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

                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }

                }
            }

        } else {
            System.out.println("该file路径不存在！！"+srcFolder.getPath());
            logger.error("该file路径不存在！！"+srcFolder.getPath());
        }
    }


    public static void decodeFile(File srcFolder, File distFolder,String srcPath, Long key) {
        if (srcFolder.exists()) {//判断路径是否存在
            if (srcFolder.isFile()) {//boolean isFile():测试此抽象路径名表示的文件是否是一个标准文件。

            } else {//不是文件，对于文件夹的操作
                //保存 路径D:/1/新建文件夹2  下的所有的文件和文件夹到listFiles数组中
                File[] listFiles = srcFolder.listFiles();//listFiles方法：返回file路径下所有文件和文件夹的绝对路径
                for (File file2 : listFiles) {
                    /*
                     * 递归作用：由外到内先一层一层删除里面的文件 再从最内层 反过来删除文件夹
                     *    注意：此时的文件夹在上一步的操作之后，里面的文件内容已全部删除
                     *         所以每一层的文件夹都是空的  ==》最后就可以直接删除了
                     */
                    if (file2.isDirectory()) {
                        decodeFile(file2, distFolder,srcPath, key);
                    } else {
                        //处理
                        if (!(file2.getName().endsWith(".x")) ){
                            continue;
                        }

                        String distPath = file2.getPath().replace(srcPath, distFolder.getName());
                        String distPathName = distPath.substring(0,distPath.indexOf(".")+1)+"jpg";

                        ByteArrayOutputStream byteArrayOutputStream = null;
                        FileInputStream fis = null;
                        FileOutputStream fileOutputStream = null;
                        try {

                            byteArrayOutputStream = new ByteArrayOutputStream();

                            fis = new FileInputStream(file2);
                            byte[] buf = new byte[1024];
                            int length = 0;
                            //循环读取文件内容，输入流中将最多buf.length个字节的数据读入一个buf数组中,返回类型是读取到的字节数。
                            //当文件读取到结尾时返回 -1,循环结束。
                            while ((length = fis.read(buf)) != -1) {
                                byteArrayOutputStream.write(buf, 0, length);
                            }

                            int index = 0;
                            byte data[] = byteArrayOutputStream.toByteArray();
                            for (int i = 0; i < 100; i++) {
                                if (i >= data.length) {
                                    break;
                                }
                                data[i] = (byte) (data[i] ^ key);
                            }

                            //                             ByteArrayInputStream bais = new ByteArrayInputStream(fis);
                            File distFile = new File(distPathName);
                            //                            distFile.deleteOnExit();
                            if(!distFile.getParentFile().exists()){
                                distFile.getParentFile().mkdirs();
                            }
                            fileOutputStream = new FileOutputStream(distPathName);
                            fileOutputStream.write(data);
                            fileOutputStream.flush();
                            logger.error("解密成功::"+distPathName);
                        } catch (IOException e) {
                            e.printStackTrace();
                            logger.error("解密错误::",e);
                        } finally {
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
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

                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }

                }
            }

        } else {
            System.out.println("该file路径不存在！！"+srcFolder.getPath());
            logger.error("该file路径不存在！！"+srcFolder.getPath());
        }
    }




    /**
     * configLogBack:(). <br/>
     * TODO().<br/>
     * logback
     *
     * @author lyh
     */
    @SuppressWarnings("unchecked")
    private static void configLogBack(String extFolderName) {
        String path = RES + "/logback.xml";
        try {
            Document doc = null;
            try {
                doc = XmlUtils.readAsDocument(path);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Element root = doc.getRootElement();
            List<Element> eles = root.elements("appender");
            for (Element el : eles) {
                Attribute nAttribute = el.attribute("name");
                if (nAttribute != null && nAttribute.getValue() != null) {
                    String name = nAttribute.getValue().trim();
                    if (name.startsWith("FILE")) {
                        Element logPathElement = el.element("rollingPolicy").element("FileNamePattern");
                        if (logPathElement != null) {
                            String logPathName = logPathElement.getTextTrim();
                            // 替换成现有的
                            String logPath = userPath + File.separator + extFolderName + File.separator + logPathName;
                            logPathElement.setText(logPath);
                        }
                    }
                }
            }

            InputStream is = new ByteArrayInputStream(doc.asXML().getBytes("utf-8"));
            LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
            JoranConfigurator configurator = new JoranConfigurator();
            configurator.setContext(lc);
            lc.reset();
            configurator.doConfigure(is);


        } catch (JoranException e) {
            e.printStackTrace(System.err);
            System.exit(-1);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
