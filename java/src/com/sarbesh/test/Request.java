package com.sarbesh.test;

import java.util.List;

public class Request {
    private String id;
    private String Name;
    private List<Integer> intList;

    public Request() {
    }

    public Request(String id, String name, List<Integer> intList) {
        this.id = id;
        Name = name;
        this.intList = intList;
    }

    @Override
    public String toString() {
        return "Request{" +
                "id='" + id + '\'' +
                ", Name='" + Name + '\'' +
                ", intList=" + intList +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Integer> getIntList() {
        return intList;
    }

    public void setIntList(List<Integer> intList) {
        this.intList = intList;
    }
}
