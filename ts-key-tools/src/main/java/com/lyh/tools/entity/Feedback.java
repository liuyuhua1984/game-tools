package com.lyh.tools.entity;

import java.io.Serializable;
import java.util.List;

public class Feedback implements Serializable {
    private String contact;

    private List<String> cover_url;

    private String created_at;

    private String id;

    private String ip;

    private List<String> keys;

    private String mobile;

    private String nick_name;

    private String remark;

    private String user_id;

    public String getContact() {
        return this.contact;
    }

    public List<String> getCover_url() {
        return this.cover_url;
    }

    public String getCreated_at() {
        return this.created_at;
    }

    public String getId() {
        return this.id;
    }

    public String getIp() {
        return this.ip;
    }

    public List<String> getKeys() {
        return this.keys;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getNick_name() {
        return this.nick_name;
    }

    public String getRemark() {
        return this.remark;
    }

    public String getUser_id() {
        return this.user_id;
    }

    public void setContact(String paramString) {
        this.contact = paramString;
    }

    public void setCover_url(List<String> paramList) {
        this.cover_url = paramList;
    }

    public void setCreated_at(String paramString) {
        this.created_at = paramString;
    }

    public void setId(String paramString) {
        this.id = paramString;
    }

    public void setIp(String paramString) {
        this.ip = paramString;
    }

    public void setKeys(List<String> paramList) {
        this.keys = paramList;
    }

    public void setMobile(String paramString) {
        this.mobile = paramString;
    }

    public void setNick_name(String paramString) {
        this.nick_name = paramString;
    }

    public void setRemark(String paramString) {
        this.remark = paramString;
    }

    public void setUser_id(String paramString) {
        this.user_id = paramString;
    }
}


