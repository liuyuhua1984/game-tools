package com.lyh.tools.entity;

import java.util.List;

public class RankingPageBean extends BaseBean {
    private List<RankingMenuBean> tags_menus;

    public class RankingMenuBean {
        private String alias;
        private int id;
        private String name;

        public String getAlias() {
            return this.alias;
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public List<RankingMenuBean> getTagsMenus() {
        return this.tags_menus;
    }
}
