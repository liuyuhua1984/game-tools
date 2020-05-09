package com.lyh.tools.entity;

import java.io.Serializable;

public class FeedbackReply implements Serializable {
    public static final int TYPE_IMG = 2;

    public static final int TYPE_TXT = 1;

    private String content;

    private String created_at;

    private String feed_id;

    private int type;

    private String user_id;

    public String getContent() {
        return this.content;
    }

    public String getCreated_at() {
        return this.created_at;
    }

    public String getFeed_id() {
        return this.feed_id;
    }

    public int getType() {
        return this.type;
    }

    public String getUser_id() {
        return this.user_id;
    }

    public void setContent(String paramString) {
        this.content = paramString;
    }

    public void setCreated_at(String paramString) {
        this.created_at = paramString;
    }

    public void setFeed_id(String paramString) {
        this.feed_id = paramString;
    }

    public void setType(int paramInt) {
        this.type = paramInt;
    }

    public void setUser_id(String paramString) {
        this.user_id = paramString;
    }
}


