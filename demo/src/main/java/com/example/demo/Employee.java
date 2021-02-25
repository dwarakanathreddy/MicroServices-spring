package com.example.demo;

import java.util.List;
import java.util.Map;

public class Employee {


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Map<String, String>> getData() {
        return data;
    }

    public void setData(List<Map<String, String>> data) {
        this.data = data;
    }

    private String status;
    private List<Map<String, String>> data;


}
