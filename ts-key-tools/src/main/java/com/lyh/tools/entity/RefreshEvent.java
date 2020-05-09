package com.lyh.tools.entity;

public class RefreshEvent {
    public static final int BIND_INVITE_CODE_SUCCESS = 10;

    public static final int BIND_PHONE_SUCCESS = 8;

    public static final int BUY_ALL_COMIC_FOLDER_SUCCESS = 17;

    public static final int BUY_COMIC_FOLDER_SUCCESS = 14;

    public static final int CHANGE_PLAY_VIDEO = 3;

    public static final int CLICK_STORE_SIGN = 18;

    public static final int COLLECTED_COMIC = 15;

    public static final int EXCHANGE_WELFARE_SUCCESS = 9;

    public static final int FIND_ACCOUNT_SUCCESS = 11;

    public static final int LIKE_VIDEO = 7;

    public static final int LOGIN_EXPIRED = 5;

    public static final int MEET_VIDEO_AD = 12;

    public static final int OPEN_GESTURE_PASSWORD = 4;

    public static final int READER_CLOSE = 19;

    public static final int UN_COLLECTED_COMIC = 16;

    public static final int UN_LIKE_VIDEO = 6;

    public static final int UPDATE_SUB_VIEWPAGER = 2;

    public static final int UPDATE_VIEWPAGER = 1;

    public static final int USER_COIN_UPDATE = 13;

    public static final int WITHDRAW_CASH_SUCCESS = 20;

    private int code;

    private Object data;

    public RefreshEvent(int paramInt) {
        this.code = paramInt;
    }

    public RefreshEvent(int paramInt, Object paramObject) {
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

