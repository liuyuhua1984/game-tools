package com.lyh.tools.entity;

import java.io.Serializable;

public class FeedbackType implements Serializable {
    private String key;

    private boolean select;

    private String value;

    public boolean equals(Object paramObject) {
        return (paramObject instanceof FeedbackType) ? this.key.equals(((FeedbackType) paramObject).key) : super.equals(paramObject);
    }

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public boolean isSelect() {
        return this.select;
    }

    public void setKey(String paramString) {
        this.key = paramString;
    }

    public void setSelect(boolean paramBoolean) {
        this.select = paramBoolean;
    }

    public void setValue(String paramString) {
        this.value = paramString;
    }
}

