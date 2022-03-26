/*
package com.algo.backtracking;

import java.util.Collections;

public class Palindromicdecompisition {
    static ArrayList<String> generate_palindromic_decompositions(String s) {
        // Write your code here.
        return new ArrayList();
    }
    private static void helper(String s,int i,String partialSol,ArrayList<String> result){
        //base case
        if(i==s.length()) {
            return;
        }
        //recursive case
        //exclusive
        helper(s,i+1,partial,result);
        // inclusive
        helper(s,i+1,partialSol+s.charAt(i),result)
        // Back Tracking
        String temp=partialSol;
        if(temp!=null){
            if(partialSol.equalsIgnoreCase(temp.))
        }
    }
    public static void main(String[] args) {
        String temp=new String();
        StringBuffer stringBuffer=new StringBuffer(temp);
        stringBuffer.reverse();
        Palindromicdecompisition palindromicdecompisition=new Palindromicdecompisition();
    }
}
*/
