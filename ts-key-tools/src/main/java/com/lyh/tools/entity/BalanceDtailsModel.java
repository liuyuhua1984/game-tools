package com.lyh.tools.entity;

import java.util.List;

public class BalanceDtailsModel {
    private int current_page;

    private List<DataBean> data;

    private String first_page_url;

    private int from;

    private int last_page;

    private String last_page_url;

    private Object next_page_url;

    private String path;

    private int per_page;

    private Object prev_page_url;

    private int to;

    private int total;

    public int getCurrent_page() {
        return this.current_page;
    }

    public List<DataBean> getData() {
        return this.data;
    }

    public String getFirst_page_url() {
        return this.first_page_url;
    }

    public int getFrom() {
        return this.from;
    }

    public int getLast_page() {
        return this.last_page;
    }

    public String getLast_page_url() {
        return this.last_page_url;
    }

    public Object getNext_page_url() {
        return this.next_page_url;
    }

    public String getPath() {
        return this.path;
    }

    public int getPer_page() {
        return this.per_page;
    }

    public Object getPrev_page_url() {
        return this.prev_page_url;
    }

    public int getTo() {
        return this.to;
    }

    public int getTotal() {
        return this.total;
    }

    public void setCurrent_page(int paramInt) {
        this.current_page = paramInt;
    }

    public void setData(List<DataBean> paramList) {
        this.data = paramList;
    }

    public void setFirst_page_url(String paramString) {
        this.first_page_url = paramString;
    }

    public void setFrom(int paramInt) {
        this.from = paramInt;
    }

    public void setLast_page(int paramInt) {
        this.last_page = paramInt;
    }

    public void setLast_page_url(String paramString) {
        this.last_page_url = paramString;
    }

    public void setNext_page_url(Object paramObject) {
        this.next_page_url = paramObject;
    }

    public void setPath(String paramString) {
        this.path = paramString;
    }

    public void setPer_page(int paramInt) {
        this.per_page = paramInt;
    }

    public void setPrev_page_url(Object paramObject) {
        this.prev_page_url = paramObject;
    }

    public void setTo(int paramInt) {
        this.to = paramInt;
    }

    public void setTotal(int paramInt) {
        this.total = paramInt;
    }

    public static class DataBean {
        private String _id;

        private String balance;

        private String created_at;

        private String msg;

        private int status;

        private String status_name;

        private String title;

        private String updated_at;

        private int user_id;

        public String getBalance() {
            return this.balance;
        }

        public String getCreated_at() {
            return this.created_at;
        }

        public String getMsg() {
            return this.msg;
        }

        public int getStatus() {
            return this.status;
        }

        public String getStatus_name() {
            return this.status_name;
        }

        public String getTitle() {
            return this.title;
        }

        public String getUpdated_at() {
            return this.updated_at;
        }

        public int getUser_id() {
            return this.user_id;
        }

        public String get_id() {
            return this._id;
        }

        public void setBalance(String param1String) {
            this.balance = param1String;
        }

        public void setCreated_at(String param1String) {
            this.created_at = param1String;
        }

        public void setMsg(String param1String) {
            this.msg = param1String;
        }

        public void setStatus(int param1Int) {
            this.status = param1Int;
        }

        public void setStatus_name(String param1String) {
            this.status_name = param1String;
        }

        public void setTitle(String param1String) {
            this.title = param1String;
        }

        public void setUpdated_at(String param1String) {
            this.updated_at = param1String;
        }

        public void setUser_id(int param1Int) {
            this.user_id = param1Int;
        }

        public void set_id(String param1String) {
            this._id = param1String;
        }
    }
}


