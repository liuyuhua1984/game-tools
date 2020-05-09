package com.lyh.tools.entity;

import java.util.List;

public class CountryCode {
    public List<CountryBean> list;

    public class CountryBean implements SortBean {
        String region_code;
        String region_name;

        public CountryBean() {
        }

        public String getCode() {
            return "+" + this.region_code;
        }

        public String getIndex() {
            return this.region_name;
        }

        public String getName() {
            return this.region_name;
        }
    }
}
