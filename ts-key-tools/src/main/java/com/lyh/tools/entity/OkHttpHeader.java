package com.lyh.tools.entity;

import com.alibaba.fastjson.annotation.JSONField;


/**
 * @author lyh
 * @CLASSNAME OkHttpHeader
 * @description head
 * @date 2019/11/7
 **/
public class OkHttpHeader {
    @JSONField(name = "Accept-Language")
    private String acceptLanguage;
    @JSONField(name = "User-Agent")
    private String userAgent;
    @JSONField(name = "Authorization")
    private String authorization;
    @JSONField(name = "version-code")
    private String versionCode;
    @JSONField(name = "device-id")
    private String deviceId;
    @JSONField(name = "platform")
    private String platform;

    @JSONField(name = "Content-Length")
    private String contentLenth;

    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public String getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getContentLenth() {
        return contentLenth;
    }

    public void setContentLenth(String contentLenth) {
        this.contentLenth = contentLenth;
    }
}
