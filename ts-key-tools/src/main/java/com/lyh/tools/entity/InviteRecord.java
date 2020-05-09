package com.lyh.tools.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

public class InviteRecord implements Serializable {
    private String code;

    @JSONField(name = "created_at")
    private String createdAt;

    private String mobile;

    private String name;

    private String nickname;

    @JSONField(name = "owner_user_id")
    private String ownerUserId;

    @JSONField(name = "use_user_id")
    private String useUserId;

    public String getCode() {
        return this.code;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getName() {
        return this.name;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getOwnerUserId() {
        return this.ownerUserId;
    }

    public String getUseUserId() {
        return this.useUserId;
    }

    public void setCode(String paramString) {
        this.code = paramString;
    }

    public void setCreatedAt(String paramString) {
        this.createdAt = paramString;
    }

    public void setMobile(String paramString) {
        this.mobile = paramString;
    }

    public void setName(String paramString) {
        this.name = paramString;
    }

    public void setNickname(String paramString) {
        this.nickname = paramString;
    }

    public void setOwnerUserId(String paramString) {
        this.ownerUserId = paramString;
    }

    public void setUseUserId(String paramString) {
        this.useUserId = paramString;
    }
}

