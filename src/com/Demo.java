package com;

import java.math.BigDecimal;
import java.util.*;

public class Demo {

    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Apple",3);
        map.put("Orange",3);
        map.put("Apple",map.get("Apple")+3);
        System.out.println(map.size());
        System.out.println(map.get("Apple"));
       List<String> list=new ArrayList<>(Arrays.asList("a","b","c"));
        boolean isdivide=10%5==0;
        System.out.println(isdivide);
       list.forEach(System.out::println);

       for (Object obj:list) {

       }

    String srtr=new String("");
    }
}
