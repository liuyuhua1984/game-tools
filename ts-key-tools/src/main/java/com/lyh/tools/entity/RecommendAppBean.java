package com.lyh.tools.entity;


import java.util.List;

public class RecommendAppBean extends BaseBean {
    public AdsBean ads;
    public int has_more;
    public int page;
    public int page_size;
    public int page_total;
    public int total;

    public class AdsBean extends BaseBean {
        public List<AppBean.APP> apps;
        public int is_show;
        public String start_app_desc = "";
        public String start_app_titles = "";
    }
}
