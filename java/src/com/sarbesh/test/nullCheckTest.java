package com.sarbesh.test;

import java.awt.*;
import java.util.ArrayList;

public class nullCheckTest {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("dhona");
        stringList.add("ark");
        stringList.add("sks");
        stringList.set(2,null);
        stringList.add("abhi");
        System.out.println("2:- "+stringList.get(2));
        ArrayList<String> stringList2 = new ArrayList<String>();
        stringList2.addAll(stringList);
        stringList=null;
        try {
            stringList.add("sarbesh");
            stringList.forEach(System.out::println);
        }
        catch (Exception e){
            System.out.println("in catch");
        }
        stringList2.forEach(System.out::println);
    }
}
