package com.lyh.tools.entity;

import java.io.Serializable;

public class VipPrivilege implements Serializable {
    private String icon;

    private String id;

    private int sort;

    private String sub_title;

    private String title;

    public String getIcon() {
        return this.icon;
    }

    public String getId() {
        return this.id;
    }

    public int getSort() {
        return this.sort;
    }

    public String getSub_title() {
        return this.sub_title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setIcon(String paramString) {
        this.icon = paramString;
    }

    public void setId(String paramString) {
        this.id = paramString;
    }

    public void setSort(int paramInt) {
        this.sort = paramInt;
    }

    public void setSub_title(String paramString) {
        this.sub_title = paramString;
    }

    public void setTitle(String paramString) {
        this.title = paramString;
    }
}

