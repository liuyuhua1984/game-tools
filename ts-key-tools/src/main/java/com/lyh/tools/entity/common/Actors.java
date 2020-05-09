package com.lyh.tools.entity.common;


import com.lyh.tools.entity.BaseBean;

public class Actors extends BaseBean {
    private String chinese_name;
    private String english_name;
    private long id;
    private String jp_name;

    public String getChinese_name() {

        return this.chinese_name;
    }

    public String getEnglish_name() {
        return this.english_name;
    }

    public long getId() {
        return this.id;
    }

    public String getJp_name() {
        return this.jp_name;
    }

    public void setChinese_name(String str) {
        this.chinese_name = str;
    }

    public void setEnglish_name(String str) {
        this.english_name = str;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setJp_name(String str) {
        this.jp_name = str;
    }
}
