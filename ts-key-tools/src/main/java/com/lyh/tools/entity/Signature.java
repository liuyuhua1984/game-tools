package com.lyh.tools.entity;

public class Signature {
    public String date;
    public String gold;
    public boolean isSignature;

    public Signature(String str, String str2) {
        this.date = str;
        this.gold = str2;
    }

    public void setSignature(boolean z) {
        this.isSignature = z;
    }
}
