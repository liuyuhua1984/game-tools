package com.lyh.tools.entity;

import java.io.Serializable;

public class AuthError implements Serializable {
    public static final int VIDEO_LIMIT_NO = 1;

    public static final int VIDEO_VIP_NO = 2;

    private String info;

    private int key;

    public String getInfo() {
        return this.info;
    }

    public int getKey() {
        return this.key;
    }

    public void setInfo(String paramString) {
        this.info = paramString;
    }

    public void setKey(int paramInt) {
        this.key = paramInt;
    }
}

