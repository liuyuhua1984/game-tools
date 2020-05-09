package com.lyh.tools.entity;

import java.io.Serializable;

public class ExchangeModel implements Serializable {
    private String code;

    private Object created_at;

    private int id;

    private int is_exchange;

    private String remark;

    private int status;

    private String title;

    private int type;

    private String updated_at;

    private int vip_day;

    public String getCode() {
        return this.code;
    }

    public Object getCreated_at() {
        return this.created_at;
    }

    public int getId() {
        return this.id;
    }

    public int getIs_exchange() {
        return this.is_exchange;
    }

    public String getRemark() {
        return this.remark;
    }

    public int getStatus() {
        return this.status;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public String getUpdated_at() {
        return this.updated_at;
    }

    public int getVip_day() {
        return this.vip_day;
    }

    public void setCode(String paramString) {
        this.code = paramString;
    }

    public void setCreated_at(Object paramObject) {
        this.created_at = paramObject;
    }

    public void setId(int paramInt) {
        this.id = paramInt;
    }

    public void setIs_exchange(int paramInt) {
        this.is_exchange = paramInt;
    }

    public void setRemark(String paramString) {
        this.remark = paramString;
    }

    public void setStatus(int paramInt) {
        this.status = paramInt;
    }

    public void setTitle(String paramString) {
        this.title = paramString;
    }

    public void setType(int paramInt) {
        this.type = paramInt;
    }

    public void setUpdated_at(String paramString) {
        this.updated_at = paramString;
    }

    public void setVip_day(int paramInt) {
        this.vip_day = paramInt;
    }
}
