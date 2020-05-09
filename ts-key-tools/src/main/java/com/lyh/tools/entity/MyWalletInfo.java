package com.lyh.tools.entity;

public class MyWalletInfo {
    private String balance;

    private String invite_count;

    private RuleBean rule;

    public String getBalance() {
        return this.balance;
    }

    public String getInvite_count() {
        return this.invite_count;
    }

    public RuleBean getRule() {
        return this.rule;
    }

    public void setBalance(String paramString) {
        this.balance = paramString;
    }

    public void setInvite_count(String paramString) {
        this.invite_count = paramString;
    }

    public void setRule(RuleBean paramRuleBean) {
        this.rule = paramRuleBean;
    }

    public static class RuleBean {
        private String is_display;

        private String title;

        public String getIs_display() {
            return this.is_display;
        }

        public String getTitle() {
            return this.title;
        }

        public void setIs_display(String param1String) {
            this.is_display = param1String;
        }

        public void setTitle(String param1String) {
            this.title = param1String;
        }
    }
}

