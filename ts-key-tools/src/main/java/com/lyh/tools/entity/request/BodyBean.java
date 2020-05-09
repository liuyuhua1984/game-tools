package com.lyh.tools.entity.request;

import java.io.Serializable;
import java.util.List;

public class BodyBean implements Serializable {
    private List<String> encodedNames;
    private List<String> encodedValues;

    public List<String> getEncodedNames() {
        return this.encodedNames;
    }

    public List<String> getEncodedValues() {
        return this.encodedValues;
    }

    public void setEncodedNames(List<String> list) {
        this.encodedNames = list;
    }

    public void setEncodedValues(List<String> list) {
        this.encodedValues = list;
    }
}
