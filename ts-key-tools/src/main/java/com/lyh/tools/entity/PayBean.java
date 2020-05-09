package com.lyh.tools.entity;


public class PayBean extends BaseBean {
    public static final String KEY_METHOD_B2C = "B2C";
    public static final String KEY_METHOD_SCAN = "SCAN";
    public String order_id;
    public String pay_url;
    public int pay_url_expired_time;
}
