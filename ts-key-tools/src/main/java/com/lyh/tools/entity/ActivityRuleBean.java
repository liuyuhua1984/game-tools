package com.lyh.tools.entity;

public class ActivityRuleBean {
    public ParamBean param;
    public String value;

    public class ParamBean {
        public String key;
        public String module;
        public String owner;
        public int platform;
        public String section;
    }
}
