package com.lyh.tools.entity;

import java.io.Serializable;

public class PrePayRecommend implements Serializable {
    private String description;

    private String id;

    private boolean isSelect;

    private String offer;

    private String price;

    private String title;

    public String getDescription() {
        return this.description;
    }

    public String getId() {
        return this.id;
    }

    public String getOffer() {
        return this.offer;
    }

    public String getPrice() {
        return this.price;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isSelect() {
        return this.isSelect;
    }

    public void setDescription(String paramString) {
        this.description = paramString;
    }

    public void setId(String paramString) {
        this.id = paramString;
    }

    public void setOffer(String paramString) {
        this.offer = paramString;
    }

    public void setPrice(String paramString) {
        this.price = paramString;
    }

    public void setSelect(boolean paramBoolean) {
        this.isSelect = paramBoolean;
    }

    public void setTitle(String paramString) {
        this.title = paramString;
    }
}

