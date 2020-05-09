package com.lyh.tools.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

public class NoticeMessage implements Serializable {
    private String id;

    @JSONField(name = "msg")
    private String message;

    public String getId() {
        return this.id;
    }

    public String getMessage() {
        return this.message;
    }

    public void setId(String paramString) {
        this.id = paramString;
    }

    public void setMessage(String paramString) {
        this.message = paramString;
    }
}

