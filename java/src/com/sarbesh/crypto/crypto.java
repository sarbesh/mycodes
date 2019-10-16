package com.sarbesh.crypto;

import java.util.Base64;

import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class crypto {
    public static void main(String[] args) {
        Base64.Encoder en = Base64.getEncoder();
        Base64.Decoder de = Base64.getDecoder();
        String json;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Token");
//        String json = sc.next();
//        json = "{\n" +
//                "  \"sub\": \"1234567890\",\n" +
//                "  \"name\": \"John Doe\",\n" +
//                "  \"iat\": 1516239022\n" +
//                "}";
        HashMap<String, String> map = new HashMap<>();
        map.put("name","sarbesh");
        map.put("id","5");
        map.put("role","admin");
        json = "{\n"+map.entrySet().stream()
                .map(e->"\""+e.getKey()+"\""+":\""+String.valueOf(e.getValue()+"\""))
                .collect(Collectors.joining(",\n "))+"\n}";
        System.out.println(json);
        String sten = en.encodeToString(json.getBytes());
        System.out.println("Encoded: "+sten);
        String stdn = new String(de.decode(sten));
        System.out.println("Decoded: "+stdn);
    }
}
