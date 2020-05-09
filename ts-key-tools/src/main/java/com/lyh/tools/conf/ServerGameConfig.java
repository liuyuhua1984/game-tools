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
    /**保存key的路径**/
    public static String KEY_SAVE_PATH = "key_save_path";

    public static String HTTP_KEY_ADDR = "http_key_addr";
    /**需要Id为1**/
    public static String NEED_ID = "need_id";

    /**key源路径**/
    public static String KEY_SRC_PATH = "key_src_path";

    /**后缀key**/
    public static String SUFFIX_KEY= "suffix_key";

    /**
     * loadGameConfig:(). <br/>
     * TODO().<br/>
     * 加载配置
     *
     * @author lyh
     */
    public static void loadGameConfig(String path) {
        Properties GAME_BUNDLE = loadGameProperties(path + "/game.properties");

        KEY_SAVE_PATH = GAME_BUNDLE.getProperty("key_save_path");

        HTTP_KEY_ADDR = GAME_BUNDLE.getProperty("http_key_addr");

        NEED_ID = GAME_BUNDLE.getProperty("need_id");

        KEY_SRC_PATH = GAME_BUNDLE.getProperty("key_src_path");

        SUFFIX_KEY = GAME_BUNDLE.getProperty("suffix_key");
    }

}
