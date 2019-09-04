package com.lyh.tool.main;


import java.net.HttpURLConnection;
import java.io.*;
import java.net.*;

import java.util.Random;

/**
 * 设置生成游戏key值
 *
 * @author: root
 * @create: 2018-10-08 14:53
 **/

public class HttpQQIntercept {
    /**
     * res路径
     **/

//
//       3: ['暂未发现风险', 'unknow', '//pc1.gtimg.com/pcmgr/online_server/images/webadmin/6.png'],
//               4: ['暂未发现风险', 'unknow', '//pc1.gtimg.com/pcmgr/online_server/images/webadmin/6.png'],
//               13: ['暂未发现风险', 'unknow', '//pc1.gtimg.com/pcmgr/online_server/images/webadmin/6.png'],
//               2: ['危险', 'danger', '//pc1.gtimg.com/pcmgr/online_server/images/webadmin/3.png'],
//               1: ['暂未发现风险', 'unknow', '//pc1.gtimg.com/pcmgr/online_server/images/webadmin/6.png'],
//               2001: ['可能涉及钱财，交易需谨慎', 'money', '//pc1.gtimg.com/pcmgr/online_server/images/webadmin/48_money.png'],
//    unknow: ['暂未发现风险', 'unknow', '//pc1.gtimg.com/pcmgr/online_server/images/webadmin/6.png']

    public static void main(String arg[]) {
        String dom = "qq-dkie.65447334.cn";
        String checkCode = get(dom,true);
        if (checkCode.equals("200")){
           String result = check(dom,false);
           System.err.println("result::"+result);
        }
//        try {
//
//
//             String url = "http://pingtas.qq.com/webview/pingd?";
//
//           // https://pingtas.qq.com/webview/pingd?dm=guanjia.qq.com&pvi=7820841984&si=s7581014016&url=/online_server/result.html&arg=url%3Dhttp%3A%2F%2Fqq-dkie.mwgha.cn&
//            // ty=1&rdm=&rurl=&rarg=&adt=&r2=35317644&r3=-1&r4=1&fl=29.0&scr=1920x1080&scl=24-bit&lg=zh-cn&jv=&tz=-8&ct=&ext=adid=&pf=&random=1567576754653
//            url+="dm=guanjia.qq.com&";
//            url+= "pvi=7820841984&&";
//            url += "si=s7581014016&";
//            url +="url=/online_server/result.html&";
//            url +="arg="+  URLEncoder.encode("url=http://qq-dkie.mwgha.cn","utf-8") +"&";
//            url += "ty=1&rdm=&rurl=&rarg=&adt=&r2=35317644&r3=-1&r4=1&fl=29.0&scr=1920x1080&scl=24-bit&lg=zh-cn&jv=&tz=-8&ct=&ext=adid=&pf=&";
//            url += "random="+new Random().nextLong();
//
//
//            URL realUrl = new URL(url);
//            HttpURLConnection connection = null;
////            if (url.toLowerCase().startsWith("https")) {
////                HttpsURLConnection httpsConn = (HttpsURLConnection) realUrl
////                        .openConnection();
////
////                httpsConn.setHostnameVerifier(new HostnameVerifier() {
////                    public boolean verify(String hostname, SSLSession session) {
////                        return true;
////                    }
////                });
////                connection = httpsConn;
////            } else {
////                connection = realUrl.openConnection();
//            //}
//
//            connection = (HttpURLConnection) realUrl.openConnection();
//            connection.setDoInput(true);
//            connection.setDoOutput(true);
//            connection.setAllowUserInteraction(false);
//            connection.setUseCaches(false);
//            // 设定请求的方法为"POST"，默认是GET
////            if (isPost) {
////                con.setRequestMethod("POST");
////            } else {
//                connection.setRequestMethod("GET");
//            //}
//           // Referer: https://guanjia.qq.com/online_server/result.html?url=http://qq-dkie.mwgha.cn&=
//            // 设置通用的请求属性
//            connection.setRequestProperty("accept", "image/webp,image/apng,image/*,*/*;q=0.8");
//            connection.setRequestProperty("connection", "Keep-Alive");
//            connection.setRequestProperty("user-agent",
//                    "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/76.0.3809.87 Safari/537.36");
//            connection.setRequestProperty("Referer","http://guanjia.qq.com/online_server/result.html?url=http://qq-dkie.mwgha.cn&=");
//            // 设置链接主机超时时间
//            connection.setConnectTimeout(100000);
//
//            // 建立实际的连接
//            connection.connect();
//
//            // 定义 BufferedReader输入流来读取URL的响应
//
//
//            InputStream in = connection.getInputStream();
//            int code = connection.getResponseCode();
//            System.err.println("code::"+code);
//            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//            byte data []  = new byte [1024];
//            int len = 0;
//            while ((len=in.read(data,0,data.length)) > 0) {
//                byteArrayOutputStream.write(data,0,len);
//            }
//
//            byte bData[] =  byteArrayOutputStream.toByteArray();
//            String str = byteArrayOutputStream.toString();
//            System.err.println("xxx::"+str);
//
//        }catch (Exception e){
//            e.printStackTrace();
//            System.exit(0);
//        }
    }

   // qq-dkie.mwgha.cn
    public static String get(String domain, boolean img){

        try {


            String url = "http://pingtas.qq.com/webview/pingd?";

            // https://pingtas.qq.com/webview/pingd?dm=guanjia.qq.com&pvi=7820841984&si=s7581014016&url=/online_server/result.html&arg=url%3Dhttp%3A%2F%2Fqq-dkie.mwgha.cn&
            // ty=1&rdm=&rurl=&rarg=&adt=&r2=35317644&r3=-1&r4=1&fl=29.0&scr=1920x1080&scl=24-bit&lg=zh-cn&jv=&tz=-8&ct=&ext=adid=&pf=&random=1567576754653
            url += "dm=guanjia.qq.com&";
            url += "pvi=7820841984&&";
            url += "si=s7581014016&";
            url += "url=/online_server/result.html&";
            url += "arg=" + URLEncoder.encode("url=" + domain, "utf-8") + "&";
            url += "ty=1&rdm=&rurl=&rarg=&adt=&r2=35317644&r3=-1&r4=1&fl=29.0&scr=1920x1080&scl=24-bit&lg=zh-cn&jv=&tz=-8&ct=&ext=adid=&pf=&";
            url += "random=" + new Random().nextLong();


            URL realUrl = new URL(url);
            HttpURLConnection connection = null;
            //            if (url.toLowerCase().startsWith("https")) {
            //                HttpsURLConnection httpsConn = (HttpsURLConnection) realUrl
            //                        .openConnection();
            //
            //                httpsConn.setHostnameVerifier(new HostnameVerifier() {
            //                    public boolean verify(String hostname, SSLSession session) {
            //                        return true;
            //                    }
            //                });
            //                connection = httpsConn;
            //            } else {
            //                connection = realUrl.openConnection();
            //}

            connection = (HttpURLConnection) realUrl.openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setAllowUserInteraction(false);
            connection.setUseCaches(false);
            // 设定请求的方法为"POST"，默认是GET
            //            if (isPost) {
            //                con.setRequestMethod("POST");
            //            } else {
            connection.setRequestMethod("GET");
            //}
            // Referer: https://guanjia.qq.com/online_server/result.html?url=http://qq-dkie.mwgha.cn&=
            // 设置通用的请求属性
            if (img){
                connection.setRequestProperty("accept", "image/webp,image/apng,image/*,*/*;q=0.8");
            }
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/76.0.3809.87 Safari/537.36");
            connection.setRequestProperty("Referer","http://guanjia.qq.com/online_server/result.html?url="+domain+"&=");
            // 设置链接主机超时时间
            connection.setConnectTimeout(100000);

            // 建立实际的连接
            connection.connect();

            // 定义 BufferedReader输入流来读取URL的响应


            InputStream in = connection.getInputStream();
            int code = connection.getResponseCode();
            if (code == 200) {
                System.err.println("code::" + code);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte data[] = new byte[1024];
                int len = 0;
                while ((len = in.read(data, 0, data.length)) > 0) {
                    byteArrayOutputStream.write(data, 0, len);
                }
                byte bData[] = byteArrayOutputStream.toByteArray();
                String str = byteArrayOutputStream.toString();
                if (str.equalsIgnoreCase("")){
                    str = "200";
                }
                return str;
            }else {
                return "-2";
            }
        }catch (Exception e){
            e.printStackTrace();
            System.exit(0);
        }
        return "-1";
    }



    public static String check(String domain, boolean img){

        try {


            String url = "http://cgi.urlsec.qq.com/index.php?m=check&a=check&";

            //https://cgi.urlsec.qq.com/index.php?m=check&a=check&callback=jQuery17208263530200804365_1567589625783&url=http%3A%2F%2Fqq-dkie.mwgha.cn&_=1567589625952

            url += "url=" + URLEncoder.encode( domain, "utf-8") + "&";

            url += "_=" + new Random().nextLong();


            URL realUrl = new URL(url);
            HttpURLConnection connection = null;
            //            if (url.toLowerCase().startsWith("https")) {
            //                HttpsURLConnection httpsConn = (HttpsURLConnection) realUrl
            //                        .openConnection();
            //
            //                httpsConn.setHostnameVerifier(new HostnameVerifier() {
            //                    public boolean verify(String hostname, SSLSession session) {
            //                        return true;
            //                    }
            //                });
            //                connection = httpsConn;
            //            } else {
            //                connection = realUrl.openConnection();
            //}

            connection = (HttpURLConnection) realUrl.openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setAllowUserInteraction(false);
            connection.setUseCaches(false);
            // 设定请求的方法为"POST"，默认是GET
            //            if (isPost) {
            //                con.setRequestMethod("POST");
            //            } else {
            connection.setRequestMethod("GET");
            //}
            // Referer: https://guanjia.qq.com/online_server/result.html?url=http://qq-dkie.mwgha.cn&=
            // 设置通用的请求属性
            if (img){
                connection.setRequestProperty("accept", "image/webp,image/apng,image/*,*/*;q=0.8");
            }
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/76.0.3809.87 Safari/537.36");
            connection.setRequestProperty("Referer","http://guanjia.qq.com/online_server/result.html?url="+domain+"&=");
            // 设置链接主机超时时间
            connection.setConnectTimeout(100000);

            // 建立实际的连接
            connection.connect();

            // 定义 BufferedReader输入流来读取URL的响应


            InputStream in = connection.getInputStream();
            int code = connection.getResponseCode();
            if (code == 200) {
                System.err.println("code::" + code);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte data[] = new byte[1024];
                int len = 0;
                while ((len = in.read(data, 0, data.length)) > 0) {
                    byteArrayOutputStream.write(data, 0, len);
                }
                byte bData[] = byteArrayOutputStream.toByteArray();
                String str = byteArrayOutputStream.toString();
                if (str.equalsIgnoreCase("")){
                    str = "200";
                }
                return str;
            }else {
                return "-2";
            }
        }catch (Exception e){
            e.printStackTrace();
            System.exit(0);
        }
        return "-1";
    }
    }
