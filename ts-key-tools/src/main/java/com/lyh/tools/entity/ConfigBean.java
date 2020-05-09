package com.lyh.tools.entity;

import java.util.List;

public class ConfigBean {
    public List<String> key;
    public ParamBean param;
    public ValueBean value;

    public class ParamBean {
        public String module;
        public String owner;
        public String section;
    }

    public class ValueBean {
        public String address;
        public String contacts;
        public String email;
        public String fax;
        public String online_time_qq;
        public String phone;
        public String qq;
        public String site;
        public String wangwang;
        public String weibo;
        public String weixin;
    }
}
