package com.lyh.tools.entity;

import java.io.Serializable;

public class GlobalType implements Serializable {
    private String description;

    private String key;

    private String name;

    public boolean equals(Object paramObject) {
        return (paramObject instanceof GlobalType) ? ((GlobalType) paramObject).getKey().equals(this.key) : super.equals(paramObject);
    }

    public String getDescription() {
        return this.description;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public void setDescription(String paramString) {
        this.description = paramString;
    }

    public void setKey(String paramString) {
        this.key = paramString;
    }

    public void setName(String paramString) {
        this.name = paramString;
    }
}


