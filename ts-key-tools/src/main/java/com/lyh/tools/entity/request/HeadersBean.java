package com.lyh.tools.entity.request;

import java.io.Serializable;
import java.util.List;

public class HeadersBean implements Serializable {
    private List<String> namesAndValues;

    public List<String> getNamesAndValues() {
        return this.namesAndValues;
    }

    public void setNamesAndValues(List<String> list) {
        this.namesAndValues = list;
    }
}
