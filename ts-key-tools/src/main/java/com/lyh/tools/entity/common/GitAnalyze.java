package com.lyh.tools.entity.common;


import com.lyh.tools.entity.BaseBean;

public class GitAnalyze extends BaseBean {
    private String body;
    private String url;

    public String getBody() {
        return this.body;
    }

    public String getUrl() {
        return this.url;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
