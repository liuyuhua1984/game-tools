package com.lyh.tools.entity;

public class AppEvent {
    private String data;

    private String mark;

    private Object obj;

    public AppEvent(String paramString, Object paramObject) {
        this.mark = paramString;
        this.obj = paramObject;
    }

    public AppEvent(String paramString1, String paramString2) {
        this.mark = paramString1;
        this.data = paramString2;
    }

    public String getData() {
        return this.data;
    }

    public String getMark() {
        return this.mark;
    }

    public Object getObj() {
        return this.obj;
    }

    public void setObj(Object paramObject) {
        this.obj = paramObject;
    }
}


