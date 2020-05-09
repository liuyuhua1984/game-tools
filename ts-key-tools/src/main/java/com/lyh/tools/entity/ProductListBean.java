package com.lyh.tools.entity;

import java.util.List;

public class ProductListBean {

    public List<Product> products;



    public class Product {
        public String amount;
        public String desc;
        public int id;
        public int is_selected;
        public List<PayType> payType;
        public String vip_desc;
        public String vip_type;

        public class PayType {
            public int id;
            public String localImg;
            public String payInterval;
            public String timeInterval;
        }
    }
}
