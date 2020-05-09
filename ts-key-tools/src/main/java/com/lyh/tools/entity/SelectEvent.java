package com.lyh.tools.entity;

public class SelectEvent {
    public static final int CANCEL_SELECT = 5;

    public static final int CHANGE_ALL_MODE = 2;

    public static final int CHANGE_SELECT_MODE = 1;

    public static final int CHANGE_SELECT_NUM = 4;

    public static final int CLICK_DELETE = 3;

    private int code;

    private Object data;

    private Object extra;

    public SelectEvent(int paramInt) {
        this.code = paramInt;
    }

    public SelectEvent(int paramInt, Object paramObject) {
        this.code = paramInt;
        this.data = paramObject;
    }

    public SelectEvent(int paramInt, Object paramObject1, Object paramObject2) {
        this.code = paramInt;
        this.data = paramObject1;
        this.extra = paramObject2;
    }

    public int getCode() {
        return this.code;
    }

    public Object getData() {
        return this.data;
    }

    public Object getExtra() {
        return this.extra;
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

    public void setExtra(Object paramObject) {
        this.extra = paramObject;
    }
}


/* Location:              C:\Users\牛\Desktop\isiyu_1.0.4-dex2jar.jar!\com\monter\tadpole\model\SelectEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */
