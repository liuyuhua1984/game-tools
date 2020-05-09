package com.lyh.tools.entity;

import java.io.Serializable;

public class VipAdInfo implements Serializable {
    private String title;

    private String url;

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public void setTitle(String paramString) {
        this.title = paramString;
    }

    public void setUrl(String paramString) {
        this.url = paramString;
    }
}

