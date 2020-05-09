package com.lyh.tools.entity;

import java.io.Serializable;

public class HotWord implements Serializable {
    private String id;

    private String title;

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setId(String paramString) {
        this.id = paramString;
    }

    public void setTitle(String paramString) {
        this.title = paramString;
    }
}
