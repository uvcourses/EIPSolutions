package com.datastructures.arrays;

import java.util.Arrays;

public class ArrayUtilityMethod {
    public static void main(String[] arg) {
        int input[]={10,20,15,40,50,70,90,96};

        Arrays.stream(input).forEach(s->System.out.println("input "+s+"\t"));
        Arrays.asList(input).stream().sorted().forEach( (s)->{ System.out.println("input sorted ");
            System.out.println(s+"\t");});
       System.out.println("binary search "+Arrays.binarySearch(input,15));
        int secondInput[]=new int[4];
        secondInput=Arrays.copyOf(input,4);
        Arrays.stream(secondInput).forEach(s->System.out.println("second input copy"+s+"\t"));
        int thirdInput[]=new int[5];
        thirdInput= Arrays.copyOfRange(input,1,5);
        Arrays.stream(thirdInput).forEach(s->System.out.println("third input copy range"+s+"\t"));

    }
}
