package com.lyh.tools.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

public class WalletInfo implements Serializable {
    public static final String SALES_TYPE_COMMON = "A";

    public static final String SALES_TYPE_SHARE = "P";

    private String bonus;

    private String bonus_a;

    private String bonus_b;

    private String bonus_c;

    private String bonus_extra;

    private String id;

    private String money;

    private String sales_type;

    @JSONField(name = "user_id")
    private String userId;

    public String getBonus() {
        return this.bonus;
    }

    public String getBonus_a() {
        return this.bonus_a;
    }

    public String getBonus_b() {
        return this.bonus_b;
    }

    public String getBonus_c() {
        return this.bonus_c;
    }

    public String getBonus_extra() {
        return this.bonus_extra;
    }

    public String getId() {
        return this.id;
    }

    public String getMoney() {
        return this.money;
    }

    public String getSales_type() {
        return this.sales_type;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setBonus(String paramString) {
        this.bonus = paramString;
    }

    public void setBonus_a(String paramString) {
        this.bonus_a = paramString;
    }

    public void setBonus_b(String paramString) {
        this.bonus_b = paramString;
    }

    public void setBonus_c(String paramString) {
        this.bonus_c = paramString;
    }

    public void setBonus_extra(String paramString) {
        this.bonus_extra = paramString;
    }

    public void setId(String paramString) {
        this.id = paramString;
    }

    public void setMoney(String paramString) {
        this.money = paramString;
    }

    public void setSales_type(String paramString) {
        this.sales_type = paramString;
    }

    public void setUserId(String paramString) {
        this.userId = paramString;
    }
}
