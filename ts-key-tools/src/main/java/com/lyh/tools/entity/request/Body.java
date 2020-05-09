package com.lyh.tools.entity.request;

import java.io.Serializable;

public class Body implements Serializable {
    private BodyBean body;
    private HeadersBean headers;

    public BodyBean getBody() {
        return this.body;
    }

    public HeadersBean getHeaders() {
        return this.headers;
    }

    public void setBody(BodyBean bodyBean) {
        this.body = bodyBean;
    }

    public void setHeaders(HeadersBean headersBean) {
        this.headers = headersBean;
    }
}
