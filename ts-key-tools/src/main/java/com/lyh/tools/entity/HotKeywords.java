package com.lyh.tools.entity;

import java.util.List;

public class HotKeywords extends BaseBean {
    private List<KeywordsBean> keywords;

    public class KeywordsBean extends BaseBean {
        private int count;
        private String keyword;
        private String name;

        public int getCount() {
            return this.count;
        }

        public String getKeyword() {
            return this.keyword;
        }

        public String getName() {
            return this.name;
        }

        public void setCount(int i) {
            this.count = i;
        }

        public void setKeyword(String str) {
            this.keyword = str;
        }

        public void setName(String str) {
            this.name = str;
        }
    }

    public List<KeywordsBean> getKeywords() {
        return this.keywords;
    }

    public void setKeywords(List<KeywordsBean> list) {
        this.keywords = list;
    }
}
