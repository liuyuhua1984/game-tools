package com.lyh.tools.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

public class SplashAd implements Serializable {
    @JSONField(name = "ad_path")
    private String adPath;

    @JSONField(name = "created_at")
    private String createdAt;

    @JSONField(name = "deleted_at")
    private String deletedAt;

    private String href;

    private String id;

    private String title;

    @JSONField(name = "updated_at")
    private String updatedAt;

    public String getAdPath() {
        return this.adPath;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public String getDeletedAt() {
        return this.deletedAt;
    }

    public String getHref() {
        return this.href;
    }

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public void setAdPath(String paramString) {
        this.adPath = paramString;
    }

    public void setCreatedAt(String paramString) {
        this.createdAt = paramString;
    }

    public void setDeletedAt(String paramString) {
        this.deletedAt = paramString;
    }

    public void setHref(String paramString) {
        this.href = paramString;
    }

    public void setId(String paramString) {
        this.id = paramString;
    }

    public void setTitle(String paramString) {
        this.title = paramString;
    }

    public void setUpdatedAt(String paramString) {
        this.updatedAt = paramString;
    }
}


/* Location:              C:\Users\牛\Desktop\isiyu_1.0.4-dex2jar.jar!\com\monter\tadpole\model\SplashAd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */
