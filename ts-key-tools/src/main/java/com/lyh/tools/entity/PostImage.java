package com.lyh.tools.entity;

import java.io.Serializable;

public class PostImage implements Serializable {
    private int index;

    private String localPath;

    private String url;

    public int getIndex() {
        return this.index;
    }

    public String getLocalPath() {
        return this.localPath;
    }

    public String getUrl() {
        return this.url;
    }

    public void setIndex(int paramInt) {
        this.index = paramInt;
    }

    public void setLocalPath(String paramString) {
        this.localPath = paramString;
    }

    public void setUrl(String paramString) {
        this.url = paramString;
    }
}

