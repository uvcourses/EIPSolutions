package com.algo.backtracking;

import java.util.ArrayList;

public class TimedTest {

    static Boolean check_if_sum_possible(ArrayList<Long> arr, Long k) {
        // Write your code here.

        Boolean flag=helper(arr,0l,0l,k,false);
       // return helper(arr,0l,0l,k,false);
        if(flag) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }


    private static Boolean helper(ArrayList<Long> arr, Long i, Long runningSum, Long k, Boolean result){

        //Back Tracking case
        if(runningSum==k){

            return Boolean.TRUE;
        }
        // Base Case

        if(i==arr.size()) {
            return result;
        }
        //exclude case
        result=helper(arr,Long.sum(i,1),runningSum,k,result);

        // include case
        result=helper(arr,Long.sum(i,1),Long.sum(runningSum,  arr.get(Math.toIntExact(i))),k,result);

        return result;

    }
    public static void main(String[] args) {
        ArrayList<Long> arr=new ArrayList<>();
        arr.add(2l);
        arr.add(4l);
        arr.add(8l);
        System.out.println(check_if_sum_possible(arr,6l));
    }
}
