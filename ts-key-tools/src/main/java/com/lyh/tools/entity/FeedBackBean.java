package com.lyh.tools.entity;


public class FeedBackBean extends BaseBean {
    private String contact;
    private String content;
    private String type;

    public String getContact() {
        return this.contact;
    }

    public String getContent() {
        return this.content;
    }

    public String getType() {
        return this.type;
    }

    public void setContact(String str) {
        this.contact = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
