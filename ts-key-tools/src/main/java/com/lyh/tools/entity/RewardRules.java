package com.lyh.tools.entity;

import java.io.Serializable;

public class RewardRules implements Serializable {
    private String day;

    private String id;

    private String person;

    private int sign;

    public String getDay() {
        return this.day;
    }

    public String getId() {
        return this.id;
    }

    public String getPerson() {
        return this.person;
    }

    public int getSign() {
        return this.sign;
    }

    public void setDay(String paramString) {
        this.day = paramString;
    }

    public void setId(String paramString) {
        this.id = paramString;
    }

    public void setPerson(String paramString) {
        this.person = paramString;
    }

    public void setSign(int paramInt) {
        this.sign = paramInt;
    }
}

