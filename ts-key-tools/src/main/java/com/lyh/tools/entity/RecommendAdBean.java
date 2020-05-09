package com.lyh.tools.entity;


import java.util.List;

public class RecommendAdBean extends BaseBean {
    private List<InfoBean> info;
    public long time;

    public class InfoBean extends BaseBean {

        private String alias;
        private String desc;
        private int id;
        private int is_more;
        private List<IndexAdVideoBean> list;
        private String module_name;
        private int module_type;
        private int number;


        public String getAlias() {
            return this.alias;
        }

        public String getDesc() {
            return this.desc;
        }

        public int getId() {
            return this.id;
        }

        public int getIs_more() {
            return this.is_more;
        }

        public List<IndexAdVideoBean> getList() {
            return this.list;
        }

        public String getModule_name() {
            return this.module_name;
        }

        public int getModule_type() {
            return this.module_type;
        }

        public int getNumber() {
            return this.number;
        }



        public void setAlias(String str) {
            this.alias = str;
        }

        public void setDesc(String str) {
            this.desc = str;
        }

        public void setId(int i) {
            this.id = i;
        }

        public void setIs_more(int i) {
            this.is_more = i;
        }

        public void setList(List<IndexAdVideoBean> list2) {
            this.list = list2;
        }

        public void setModule_name(String str) {
            this.module_name = str;
        }

        public void setModule_type(int i) {
            this.module_type = i;
        }

        public void setNumber(int i) {
            this.number = i;
        }
    }

    public List<InfoBean> getInfo() {
        return this.info;
    }

    public void setInfo(List<InfoBean> list) {
        this.info = list;
    }
}
