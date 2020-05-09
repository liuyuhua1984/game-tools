package com.lyh.tools.entity.common;



import com.lyh.tools.entity.BaseBean;

import java.util.ArrayList;
import java.util.List;

public class AppInfoList extends BaseBean {
    private List<AppInfo> allApplist;
    private ArrayList<AppInfo> systemAppInfos;
    private ArrayList<AppInfo> userAppInfos;

    public List<AppInfo> getAllApplist() {
        return this.allApplist;
    }

    public ArrayList<AppInfo> getSystemAppInfos() {
        return this.systemAppInfos;
    }

    public ArrayList<AppInfo> getUserAppInfos() {
        return this.userAppInfos;
    }

    public void setAllApplist(List<AppInfo> list) {
        this.allApplist = list;
    }

    public void setSystemAppInfos(ArrayList<AppInfo> arrayList) {
        this.systemAppInfos = arrayList;
    }

    public void setUserAppInfos(ArrayList<AppInfo> arrayList) {
        this.userAppInfos = arrayList;
    }
}
