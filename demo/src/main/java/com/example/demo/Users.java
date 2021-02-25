package com.example.demo;

import java.util.List;
import java.util.Map;

public class Users {

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Map<String, Map<String, String>> getMeta() {
        return meta;
    }

    public void setMeta(Map<String, Map<String, String>> meta) {
        this.meta = meta;
    }

    public List<Map<String, String>> getData() {
        return data;
    }

    public void setData(List<Map<String, String>> data) {
        this.data = data;
    }

    private int code;
    private Map<String, Map<String, String>> meta;
    private List<Map<String, String>> data;

}
