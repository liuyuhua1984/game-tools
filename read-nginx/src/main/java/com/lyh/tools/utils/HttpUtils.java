package com.lyh.tools.utils;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HttpUtils {


    private static final int TIME_OUT = 5;

    private static final Logger logger = LoggerFactory.getLogger(HttpUtils.class);



    public static String getRequest(String urlString, int timeout,String headers) {
        boolean ret = false;
        String result = "";
        HttpURLConnection con = null;
        try {

                //logger.error("开始下载filename::" + urlString);
                // 构造URL
                URL url = new URL(urlString);
                // 打开连接
                con = (HttpURLConnection) url.openConnection();
                con.setRequestProperty("referer","http://www.qq.com");
              //  con.setRequestProperty("User-Agent", "MyExoSourceManager/"+ServerGameConfig.APP_VERSIOIN+" (Linux;Android 6.0.1) ExoPlayerLib/2.9.3");
                //con.setRequestProperty("User-Agent", "Mozilla/5.0 (Linux; Android 5.0; SM-G900P Build/LRX21T) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.100 Mobile Safari/537.36");
                con.setRequestProperty("accept", "*/*");
                con.setRequestProperty("connection", "Keep-alive");
//                con.setRequestProperty("allowCrossProtocolRedirects", "true");
//                con.setRequestProperty("ee", "33");
            if (!ToolUtils.isStringNull(headers)) {
                Map<String,String> mapType = JSON.parseObject(headers, HashMap.class);
                for (Entry<String,String> map : mapType.entrySet()){
                    con.setRequestProperty(map.getKey(), map.getValue());
                }
            }
                //con.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
                // Content-Type: application/octet-stream
                //				con.setRequestProperty("Content-Type", "application/octet-stream");
                con.setConnectTimeout(timeout);
                con.setReadTimeout(timeout);

                con.setDoOutput(true);
                con.setUseCaches(false);
                con.connect();
                //int contentLength = con.getContentLength();
                // 输入流
                InputStream is = con.getInputStream();
                // 1K的数据缓冲
                byte[] bs = new byte[1024];
                // 读取到的数据长度
                int len;
                // 输出的文件流


                ByteArrayOutputStream  os = new ByteArrayOutputStream();
                // 开始读取
                while ((len = is.read(bs)) != -1) {
                    os.write(bs, 0, len);
                }
                os.flush();
                // 完毕，关闭所有链接
                result = new String(os.toByteArray(),"UTF-8");
                os.close();
                is.close();


        } catch (IOException e) {
            e.printStackTrace();
            logger.error("异常="+urlString,e);
        } finally {
            if (con != null) {

                con.disconnect();
            }

        }
        return result;
    }

//    /**
//     * http下载
//     *
//     * @param httpUrl
//     * @param saveFile
//     * @return
//     */
//    public static boolean httpDownload(String httpUrl, String saveFile) {
//        // 1.下载网络文件
//        int byteRead;
//        URL url;
//        try {
//            url = new URL(httpUrl);
//        } catch (MalformedURLException e1) {
//            e1.printStackTrace();
//            return false;
//        }
//
//        try {
//            //2.获取链接
//            URLConnection conn = url.openConnection();
//            //3.输入流
//            InputStream inStream = conn.getInputStream();
//            //3.写入文件
//            FileOutputStream fs = new FileOutputStream(saveFile);
//
//            byte[] buffer = new byte[1024];
//            while ((byteRead = inStream.read(buffer)) != -1) {
//                fs.write(buffer, 0, byteRead);
//            }
//            fs.flush();
//            inStream.close();
//            fs.close();
//            logger.error("一下载完成::" + saveFile);
//            return true;
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            return false;
//        } catch (IOException e) {
//            e.printStackTrace();
//            return false;
//        }
//    }


    /**
     * 下载文件
     *
     * @param urlString
     * @param filename
     * @param timeout
     * @return
     */
    public static boolean downloadFile(String urlString, String filename, int timeout) {
        boolean ret = false;
        File file = new File(filename);
        HttpURLConnection con = null;
        try {

            if (file.exists()) {
                ret = true;
            } else {
                logger.error("开始下载filename::" + filename);
                // 构造URL
                URL url = new URL(urlString);
                // 打开连接
                con = (HttpURLConnection) url.openConnection();
               // con.setRequestProperty("referer","http://www.qq.com");
              // con.setRequestProperty("User-Agent", "MyExoSourceManager/"+ServerGameConfig.APP_VERSIOIN+" (Linux;Android 6.0.1) ExoPlayerLib/2.9.3");
               // con.setRequestProperty("User-Agent", "Mozilla/5.0 (Linux; Android 5.0; SM-G900P Build/LRX21T) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.100 Mobile Safari/537.36");
              //  con.setRequestProperty("accept", "*/*");
                con.setRequestProperty("connection", "Keep-alive");
//                con.setRequestProperty("allowCrossProtocolRedirects", "true");
//                con.setRequestProperty("ee", "33");

                con.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
                // Content-Type: application/octet-stream
                //				con.setRequestProperty("Content-Type", "application/octet-stream");
                con.setConnectTimeout(timeout);
                con.setReadTimeout(timeout);

                con.setDoOutput(true);
                con.setUseCaches(false);
                con.connect();
                int contentLength = con.getContentLength();
                // 输入流
                InputStream is = con.getInputStream();
                // 1K的数据缓冲
                byte[] bs = new byte[1024];
                // 读取到的数据长度
                int len;
                // 输出的文件流

                File file2 = new File(file.getParent());
                file2.mkdirs();
                if (file.isDirectory()) {

                } else {
                    file.createNewFile();//创建文件
                }
                OutputStream os = new FileOutputStream(file);
                // 开始读取
                while ((len = is.read(bs)) != -1) {
                    os.write(bs, 0, len);
                }
                os.flush();
                // 完毕，关闭所有链接
                os.close();
                is.close();
                logger.error("下载filename::" + filename);
                if (contentLength > -1 && contentLength != file.length()) {
                    if (file.isFile() && file.exists()) {
                        file.delete();
                    }
                    ret = false;
                } else {
                    ret = true;
                    logger.error("保存filename::" + filename);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            if (file.isFile() && file.exists()) {
                file.delete();
            }
            ret = false;
            logger.error("[VideoUtil:download]:\n" + " VIDEO URL：" + urlString + " \n NEW FILENAME:" + filename + " DOWNLOAD FAILED!! ", e);
        } finally {
            if (con != null) {

                con.disconnect();
            }
            return ret;
        }
    }

    /**
     * http下载
     *
     * @param httpUrl
     * @param saveFile
     * @return
     */
    public static boolean httpDownload(String httpUrl, String saveFile) {
        // 1.下载网络文件
        int byteRead;
        URL url;
        try {
            url = new URL(httpUrl);
        } catch (MalformedURLException e1) {
            e1.printStackTrace();
            return false;
        }

        try {
            //2.获取链接
            URLConnection conn = url.openConnection();
            //3.输入流
            InputStream inStream = conn.getInputStream();
            //3.写入文件
            FileOutputStream fs = new FileOutputStream(saveFile);

            byte[] buffer = new byte[1024];
            while ((byteRead = inStream.read(buffer)) != -1) {
                fs.write(buffer, 0, byteRead);
            }
            fs.flush();
            inStream.close();
            fs.close();
            logger.error("一下载完成::" + saveFile);
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 使用HTTP POST 发送文本
     *
     * @param httpUrl  发送的地址
     * @param postBody 发送的内容
     * @return 返回HTTP SERVER的处理结果,如果返回null,发送失败
     */
    public static String sentPost(String httpUrl, String postBody) {
        return sentPost(httpUrl, postBody, "UTF-8", null);
    }

    /**
     * 使用HTTP POST 发送文本
     *
     * @param httpUrl  发送的地址
     * @param postBody 发送的内容
     * @return 返回HTTP SERVER的处理结果,如果返回null,发送失败
     */
    public static String sentPost(String httpUrl, String postBody, String encoding) {
        return sentPost(httpUrl, postBody, encoding, null);
    }

    /**
     * 使用HTTP POST 发送文本
     *
     * @param httpUrl   目的地址
     * @param postBody  post的包体
     * @param headerMap 增加的Http头信息
     * @return
     */
    public static String sentPost(String httpUrl, String postBody, Map<String, String> headerMap) {
        return sentPost(httpUrl, postBody, "UTF-8", headerMap);
    }

    /**
     * 使用HTTP POST 发送文本
     *
     * @param httpUrl   发送的地址
     * @param postBody  发送的内容
     * @param encoding  发送的内容的编码
     * @param headerMap 增加的Http头信息
     * @return 返回HTTP SERVER的处理结果,如果返回null,发送失败
     * .................
     */
    public static String sentPost(String httpUrl, String postBody, String encoding, Map<String, String> headerMap) {
        HttpURLConnection httpCon = null;
        String responseBody = null;
        URL url = null;
        try {
            url = new URL(httpUrl);
        } catch (MalformedURLException e1) {
            return null;
        }
        try {
            httpCon = (HttpURLConnection) url.openConnection();
        } catch (IOException e1) {
            return null;
        }
        if (httpCon == null) {
            return null;
        }
        httpCon.setDoOutput(true);
        httpCon.setConnectTimeout(TIME_OUT * 1000);
        httpCon.setReadTimeout(TIME_OUT * 1000);
        httpCon.setDoOutput(true);
        httpCon.setUseCaches(false);
        try {
            httpCon.setRequestMethod("POST");
        } catch (ProtocolException e1) {
            return null;
        }
        if (headerMap != null) {
            Iterator<Entry<String, String>> iterator = headerMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Entry<String, String> entry = iterator.next();
                httpCon.addRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        OutputStream output;
        try {
            output = httpCon.getOutputStream();
        } catch (IOException e1) {
            return null;
        }
        try {
            output.write(postBody.getBytes(encoding));
        } catch (UnsupportedEncodingException e1) {
            return null;
        } catch (IOException e1) {
            return null;
        }
        try {
            output.flush();
            output.close();
        } catch (IOException e1) {
            return null;
        }
        // 开始读取返回的内容
        InputStream in;
        try {
            in = httpCon.getInputStream();
        } catch (IOException e1) {
            return null;
        }
        /**
         * 这个方法可以在读写操作前先得知数据流里有多少个字节可以读取。
         * 需要注意的是，如果这个方法用在从本地文件读取数据时，一般不会遇到问题，
         * 但如果是用于网络操作，就经常会遇到一些麻烦。
         * 比如，Socket通讯时，对方明明发来了1000个字节，但是自己的程序调用available()方法却只得到900，或者100，甚至是0，
         * 感觉有点莫名其妙，怎么也找不到原因。
         * 其实，这是因为网络通讯往往是间断性的，一串字节往往分几批进行发送。
         * 本地程序调用available()方法有时得到0，这可能是对方还没有响应，也可能是对方已经响应了，但是数据还没有送达本地。
         * 对方发送了1000个字节给你，也许分成3批到达，这你就要调用3次available()方法才能将数据总数全部得到。
         *
         * 经常出现size为0的情况，导致下面readCount为0使之死循环(while (readCount != -1) {xxxx})，出现死机问题
         */
        int size = 0;
        try {
            size = in.available();
        } catch (IOException e1) {
            return null;
        }
        if (size == 0) {
            size = 1024;
        }
        byte[] readByte = new byte[size];
        // 读取返回的内容
        int readCount = -1;
        try {
            readCount = in.read(readByte, 0, size);
        } catch (IOException e1) {
            return null;
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        while (readCount != -1) {
            baos.write(readByte, 0, readCount);
            try {
                readCount = in.read(readByte, 0, size);
            } catch (IOException e) {
                return null;
            }
        }
        try {
            responseBody = new String(baos.toByteArray(), encoding);
        } catch (UnsupportedEncodingException e) {
            return null;
        } finally {
            if (httpCon != null) {
                httpCon.disconnect();
            }
            if (baos != null) {
                try {
                    baos.close();
                } catch (IOException e) {
                }
            }
        }
        return responseBody;
    }
}
