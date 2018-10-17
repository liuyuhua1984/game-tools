package com.lyh.tool.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * 读取游戏属性
 *
 * @author: root
 * @create: 2018-10-08 15:03
 **/

public class GameProperties {

    /**
     * loadGameProperties:(). <br/>
     * TODO().<br/>
     * 加载配置属性
     *
     * @param propertiesPath
     * @author lyh
     */
    public static Properties loadGameProperties(String propertiesPath) {
        InputStream is = null;
        Properties GAME_BUNDLE = null;
        try {

            GAME_BUNDLE = new Properties();

            is = new FileInputStream(propertiesPath);
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "utf-8"));
            if (is != null) {
                GAME_BUNDLE.load(br);
            }
            br.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

        return GAME_BUNDLE;
    }
}
