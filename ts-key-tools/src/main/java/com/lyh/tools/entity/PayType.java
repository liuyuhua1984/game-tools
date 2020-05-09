package com.lyh.tools.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

public class PayType implements Serializable {
    public static final String TYPE_WX = "2";

    public static final String TYPE_YSF = "3";

    public static final String TYPE_YUER = "4";

    public static final String TYPE_ZFB = "1";

    private String id;

    @JSONField(name = "key")
    private String payType;

    private boolean selected;

    private boolean status;

    private String title;

    public String getId() {
        return this.id;
    }

    public String getPayType() {
        return this.payType;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setId(String paramString) {
        this.id = paramString;
    }

    public void setPayType(String paramString) {
        this.payType = paramString;
    }

    public void setSelected(boolean paramBoolean) {
        this.selected = paramBoolean;
    }

    public void setStatus(boolean paramBoolean) {
        this.status = paramBoolean;
    }

    public void setTitle(String paramString) {
        this.title = paramString;
    }
}

