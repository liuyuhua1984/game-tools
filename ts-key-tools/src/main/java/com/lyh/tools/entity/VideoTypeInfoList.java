package com.lyh.tools.entity;

import java.util.List;

/**
 * @author lyh
 * @CLASSNAME VideoInfoList
 * @description 视频列表
 * @date 2019/11/8
 **/
public class VideoTypeInfoList {

    private int current_page;

    private List<VideoTypeInfo> data;

    private int total;

    public int getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(int current_page) {
        this.current_page = current_page;
    }

    public List<VideoTypeInfo> getData() {
        return data;
    }

    public void setData(List<VideoTypeInfo> data) {
        this.data = data;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
