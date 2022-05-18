package com.lyh.tools;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import com.lyh.tools.conf.ServerGameConfig;
import com.lyh.tools.nginx.ReadNginxManager;
import com.lyh.tools.utils.XmlUtils;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class ReadNginxApp
{
    public static String USER_DIR = System.getProperty("user.dir");
    public static String RES = "/res-read-nginx/";
    public static void main( String[] args )
    {
        //打印log
        configLogBack("nginx_log");
        ServerGameConfig.loadGameConfig(USER_DIR + File.separator + RES);
      //  OssTxtManager.encryptOrDecrypt();
        ReadNginxManager.readNginx(USER_DIR+RES+ServerGameConfig.READ_FILE_PATH);
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

        String path = USER_DIR + File.separator + RES + "/logback.xml";
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
                            String logPath = USER_DIR + File.separator + extFolderName + File.separator + logPathName;
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
