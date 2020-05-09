package com.lyh.tools.entity;

import java.util.List;

/**
 * @author lyh
 * @CLASSNAME SpecialList
 * @description 特殊列表
 * @date 2019/11/8
 **/
public class SpecialList {

    private int current_page;

    private List<SpecialInfo> data;

    private int total;

    public int getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(int current_page) {
        this.current_page = current_page;
    }

    public List<SpecialInfo> getData() {
        return data;
    }

    public void setData(List<SpecialInfo> data) {
        this.data = data;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
