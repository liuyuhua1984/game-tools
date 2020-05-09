package com.lyh.tools.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.sql.Timestamp;

/**
*
 *功能描述
 * @author lyh
 * @date
 * @param  * @param null
 * @return
 */
public class TypeListItem implements Serializable {
    private int id;

    private int sort;

    private String title;

    @JSONField(name = "created_at")
    private Timestamp createdAt;

    @JSONField(name = "updated_at")
    private Timestamp updatedAt;

    public TypeListItem() {
    }

    public TypeListItem(int paramInt1, String paramString, int paramInt2) {
        this.id = paramInt1;
        this.title = paramString;
        this.sort = paramInt2;
    }

    public int getId() {
        return this.id;
    }

    public int getSort() {
        return this.sort;
    }

    public String getTitle() {
        return this.title;
    }

    public void setId(int paramInt) {
        this.id = paramInt;
    }

    public void setSort(int paramInt) {
        this.sort = paramInt;
    }

    public void setTitle(String paramString) {
        this.title = paramString;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}


