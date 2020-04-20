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
    public static String AES_IV = "aesIV";

    public static String AES_KEY = "aesKey";
    /**oss名称**/
    public static String OSS_TXT_NAME = "ossTxtName";
    /**OSS加密内容**/
    public static String OSS_JSON = "ossJson";
    /**加密1**/
    public static String ENCRYPT = "encrypt";


    /**
     * loadGameConfig:(). <br/>
     * TODO().<br/>
     * 加载配置
     *
     * @author lyh
     */
    public static void loadGameConfig(String path) {
        Properties GAME_BUNDLE = loadGameProperties(path + "/game.properties");

        AES_IV = GAME_BUNDLE.getProperty("aesIV");

        AES_KEY = GAME_BUNDLE.getProperty("aesKey");

        OSS_TXT_NAME = GAME_BUNDLE.getProperty("ossTxtName");
        OSS_JSON = GAME_BUNDLE.getProperty("ossJson");

        ENCRYPT = GAME_BUNDLE.getProperty("encrypt");

    }

}
