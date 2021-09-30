package com.lyh.tools.conf;

import java.util.Properties;


/**
 * ClassName:ServerGameConfig <br/>
 * Function: TODO (游戏的配置文件). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-2-19 上午10:56:06 <br/>
 *
 * @author lyh
 * @see
 */

public class ServerGameConfig extends ServerProperties {

    //    Accept-Language: zh-CN,zh;q=0.8
    //    User-Agent: okhttp/3.10.0
    //    Authorization: Bearer 7ba01e0174a187de9521f54b41841ee6 17180695dc3864ca91828.92995623
    //    version-code: 1.0.4
    //    device-id: 3c54461b-b6a0-331b-b056-941ed6fd0483
    //    platform: A
    /**文件夹和文件**/
    public static String FOLDER = "folder";

    /**文件后缀**/
    public static String FILE_SUFFIX = "file_suffix";
    /**模式**/
    public static String MODE = "mode";
    /**旧域名**/
    public static String DOMAIN_SRC = "domain_src";
    /**目标域名**/
    public static String DOMAIN_DIST = "domain_dist";


    /**
     * loadGameConfig:(). <br/>
     * TODO().<br/>
     * 加载配置
     *
     * @author lyh
     */
    public static void loadGameConfig(String path) {
        Properties GAME_BUNDLE = loadGameProperties(path + "/game.properties");

        FOLDER = GAME_BUNDLE.getProperty("folder");

        FILE_SUFFIX = GAME_BUNDLE.getProperty("file_suffix");

        MODE = GAME_BUNDLE.getProperty("mode");
        DOMAIN_SRC = GAME_BUNDLE.getProperty("domain_src");

        DOMAIN_DIST = GAME_BUNDLE.getProperty("domain_dist");

    }

}
