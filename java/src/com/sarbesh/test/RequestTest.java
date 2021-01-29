package com.sarbesh.test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RequestTest {
    @Test
    public void testRequest(){
        ChildRequest childRequest = new ChildRequest();
        childRequest.setId("1");
        childRequest.setName("me1");
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        childRequest.setIntList(intList);
        Request request = childRequest;
        System.out.println(request.toString());;
    }
}
