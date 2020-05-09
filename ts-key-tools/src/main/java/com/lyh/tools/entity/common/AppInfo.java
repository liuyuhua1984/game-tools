package com.lyh.tools.entity.common;


import com.lyh.tools.entity.BaseBean;

public class AppInfo extends BaseBean {

    private String appName;
    private boolean inRom;
    private String packname;
    private long pkgSize;
    private int uid;
    private boolean userApp;
    private String version;



    public String getAppName() {
        return this.appName;
    }

    public String getPackname() {
        return this.packname;
    }

    public long getPkgSize() {
        return this.pkgSize;
    }

    public int getUid() {
        return this.uid;
    }

    public String getVersion() {
        return this.version;
    }

    public boolean isInRom() {
        return this.inRom;
    }

    public boolean isUserApp() {
        return this.userApp;
    }



    public void setAppName(String str) {
        this.appName = str;
    }

    public void setInRom(boolean z) {
        this.inRom = z;
    }

    public void setPackname(String str) {
        this.packname = str;
    }

    public void setPkgSize(long j) {
        this.pkgSize = j;
    }

    public void setUid(int i) {
        this.uid = i;
    }

    public void setUserApp(boolean z) {
        this.userApp = z;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
