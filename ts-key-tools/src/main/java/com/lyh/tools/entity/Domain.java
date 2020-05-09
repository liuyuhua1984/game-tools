package com.lyh.tools.entity;


public class Domain extends BaseBean {
    public String api_domain;
    public String created_at;
    public String domain;
    public long id;
    public String protocol;
    public String status;
    public String updated_at;

    public Domain() {
    }

    public Domain(long j, String str, String str2, String str3, String str4, String str5, String str6) {
        this.id = j;
        this.protocol = str;
        this.domain = str2;
        this.status = str3;
        this.created_at = str4;
        this.updated_at = str5;
        this.api_domain = str6;
    }

    public String getApi_domain() {
        return this.api_domain;
    }

    public String getCreated_at() {
        return this.created_at;
    }

    public String getDomain() {
        return this.domain;
    }

    public long getId() {
        return this.id;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String getStatus() {
        return this.status;
    }

    public String getUpdated_at() {
        return this.updated_at;
    }

    public void setApi_domain(String str) {
        this.api_domain = str;
    }

    public void setCreated_at(String str) {
        this.created_at = str;
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public void setId(int i) {
        this.id = (long) i;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setUpdated_at(String str) {
        this.updated_at = str;
    }
}
