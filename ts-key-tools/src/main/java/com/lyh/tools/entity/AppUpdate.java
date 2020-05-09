package com.lyh.tools.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

public class AppUpdate implements Serializable {
    @JSONField(name = "file_upload_url")
    private String fileUploadUrl;

    private boolean force;

    private String id;

    @JSONField(name = "official_url")
    private String officialUrl;

    @JSONField(name = "package_path")
    private String packagePath;

    @JSONField(name = "potato_invite_link")
    private String potatoInviteLink;

    private String remark;

    @JSONField(name = "share_text")
    private String shareText;

    @JSONField(name = "share_url")
    private String shareUrl;

    @JSONField(name = "static_url")
    private String staticUrl;

    private String title;

    @JSONField(name = "version_code")
    private String versionCode;

    public String getFileUploadUrl() {
        return this.fileUploadUrl;
    }

    public String getId() {
        return this.id;
    }

    public String getOfficialUrl() {
        return this.officialUrl;
    }

    public String getPackagePath() {
        return this.packagePath;
    }

    public String getPotatoInviteLink() {
        return this.potatoInviteLink;
    }

    public String getRemark() {
        return this.remark;
    }

    public String getShareText() {
        return this.shareText;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public String getStaticUrl() {
        return this.staticUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public String getVersionCode() {
        return this.versionCode;
    }

    public boolean isForce() {
        return this.force;
    }

    public void setFileUploadUrl(String paramString) {
        this.fileUploadUrl = paramString;
    }

    public void setForce(boolean paramBoolean) {
        this.force = paramBoolean;
    }

    public void setId(String paramString) {
        this.id = paramString;
    }

    public void setOfficialUrl(String paramString) {
        this.officialUrl = paramString;
    }

    public void setPackagePath(String paramString) {
        this.packagePath = paramString;
    }

    public void setPotatoInviteLink(String paramString) {
        this.potatoInviteLink = paramString;
    }

    public void setRemark(String paramString) {
        this.remark = paramString;
    }

    public void setShareText(String paramString) {
        this.shareText = paramString;
    }

    public void setShareUrl(String paramString) {
        this.shareUrl = paramString;
    }

    public void setStaticUrl(String paramString) {
        this.staticUrl = paramString;
    }

    public void setTitle(String paramString) {
        this.title = paramString;
    }

    public void setVersionCode(String paramString) {
        this.versionCode = paramString;
    }
}

