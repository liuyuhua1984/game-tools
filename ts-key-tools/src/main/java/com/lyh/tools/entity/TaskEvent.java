package com.lyh.tools.entity;

public class TaskEvent {
    public static final int FINISH_TASK = 1;

    public static final int UPLOAD_VIDEO_DURATION = 2;

    private int code;

    private Object data;

    public TaskEvent(int paramInt) {
        this.code = paramInt;
    }

    public TaskEvent(int paramInt, Object paramObject) {
        this.code = paramInt;
        this.data = paramObject;
    }

    public int getCode() {
        return this.code;
    }

    public Object getData() {
        return this.data;
    }

    public boolean isCode(int paramInt) {
        return (this.code == paramInt);
    }

    public void setCode(int paramInt) {
        this.code = paramInt;
    }

    public void setData(Object paramObject) {
        this.data = paramObject;
    }
}


