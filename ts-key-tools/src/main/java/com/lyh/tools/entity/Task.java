package com.lyh.tools.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

public class Task implements Serializable {
    public static final String TASK_KEY_BIND_MOBILE = "BIND_MOBILE";

    public static final String TASK_KEY_CLICK_AD = "CLICK_AD";

    public static final String TASK_KEY_COLLECT_COMIC = "COLLECT_COMIC";

    public static final String TASK_KEY_SAVE_CARD = "SAVE_CARD";

    public static final String TASK_KEY_SAVE_PHOTO = "SAVE_PHOTO";

    public static final String TASK_KEY_SHARE_COMIC = "SHARE_COMIC";

    private int day;

    private String group;

    @JSONField(name = "group_sort")
    private int groupSort;

    private int has;

    private String icon;

    private String id;

    private String key;

    @JSONField(name = "satisfy_count")
    private int satisfyCount;

    private int sign;

    private int sort;

    private int status;

    private String title;

    public int getDay() {
        return this.day;
    }

    public String getGroup() {
        return this.group;
    }

    public int getGroupSort() {
        return this.groupSort;
    }

    public int getHas() {
        return this.has;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getId() {
        return this.id;
    }

    public String getKey() {
        return this.key;
    }

    public int getSatisfyCount() {
        return this.satisfyCount;
    }

    public int getSign() {
        return this.sign;
    }

    public int getSort() {
        return this.sort;
    }

    public int getStatus() {
        return this.status;
    }

    public String getTitle() {
        return this.title;
    }

    public void setDay(int paramInt) {
        this.day = paramInt;
    }

    public void setGroup(String paramString) {
        this.group = paramString;
    }

    public void setGroupSort(int paramInt) {
        this.groupSort = paramInt;
    }

    public void setHas(int paramInt) {
        this.has = paramInt;
    }

    public void setIcon(String paramString) {
        this.icon = paramString;
    }

    public void setId(String paramString) {
        this.id = paramString;
    }

    public void setKey(String paramString) {
        this.key = paramString;
    }

    public void setSatisfyCount(int paramInt) {
        this.satisfyCount = paramInt;
    }

    public void setSign(int paramInt) {
        this.sign = paramInt;
    }

    public void setSort(int paramInt) {
        this.sort = paramInt;
    }

    public void setStatus(int paramInt) {
        this.status = paramInt;
    }

    public void setTitle(String paramString) {
        this.title = paramString;
    }
}

