package com.lyh.tools.entity;


import java.util.List;

public class ShareRuleData extends BaseBean {
    public int gold_num;
    public String invitation_page_link;
    public List<SharePoint> list;
    public String rule;

    public class SharePoint {
        private int id;
        private String item_id;
        private String item_num;
        private ItemRewardBean item_reward;
        private String name;
        private int reward_id;

        public class ItemRewardBean {
            private int id;
            private String item_id;
            private String item_num;
            private List<ItemsBean> items;
            private String name;

            public class ItemsBean {
                private String icon;
                private int id;
                private Object key;
                private String name;
                private int num;

                public String getIcon() {
                    return this.icon;
                }

                public int getId() {
                    return this.id;
                }

                public Object getKey() {
                    return this.key;
                }

                public String getName() {
                    return this.name;
                }

                public int getNum() {
                    return this.num;
                }

                public void setIcon(String str) {
                    this.icon = str;
                }

                public void setId(int i) {
                    this.id = i;
                }

                public void setKey(Object obj) {
                    this.key = obj;
                }

                public void setName(String str) {
                    this.name = str;
                }

                public void setNum(int i) {
                    this.num = i;
                }
            }

            public int getId() {
                return this.id;
            }

            public String getItem_id() {
                return this.item_id;
            }

            public String getItem_num() {
                return this.item_num;
            }

            public List<ItemsBean> getItems() {
                return this.items;
            }

            public String getName() {
                return this.name;
            }

            public void setId(int i) {
                this.id = i;
            }

            public void setItem_id(String str) {
                this.item_id = str;
            }

            public void setItem_num(String str) {
                this.item_num = str;
            }

            public void setItems(List<ItemsBean> list) {
                this.items = list;
            }

            public void setName(String str) {
                this.name = str;
            }
        }

        public int getId() {
            return this.id;
        }

        public String getItem_id() {
            return this.item_id;
        }

        public String getItem_num() {
            return this.item_num;
        }

        public ItemRewardBean getItem_reward() {
            return this.item_reward;
        }

        public String getName() {
            return this.name;
        }

        public int getReward_id() {
            return this.reward_id;
        }

        public void setId(int i) {
            this.id = i;
        }

        public void setItem_id(String str) {
            this.item_id = str;
        }

        public void setItem_num(String str) {
            this.item_num = str;
        }

        public void setItem_reward(ItemRewardBean itemRewardBean) {
            this.item_reward = itemRewardBean;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setReward_id(int i) {
            this.reward_id = i;
        }
    }
}
