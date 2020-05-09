package com.lyh.tools.entity;

import java.util.List;

public class DropdownDesc extends BaseBean {
    private List<String> desc;
    public long time;

    public List<String> getDesc() {
        return this.desc;
    }

    public void setDesc(List<String> list) {
        this.desc = list;
    }
}
