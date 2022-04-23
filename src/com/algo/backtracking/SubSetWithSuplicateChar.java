package com.algo.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSetWithSuplicateChar {
    static ArrayList<String> get_distinct_subsets(String s) {
        // Write your code here.
        ArrayList<String> result=new ArrayList<String>();
        char s1[]=s.toCharArray();
        Arrays.sort(s1);
        helper(s1,0,new StringBuilder(),result);
        System.out.println(result);
        return result;
    }
    private static void helper(char s[],int i,StringBuilder partialSol,ArrayList<String> result){
        if(i==s.length){
            result.add(partialSol.toString());
            return;
        }else {
            partialSol.append(s[i]);
            helper(s, i + 1, partialSol, result);
            partialSol.deleteCharAt(partialSol.length()-1);

            while(i <s.length-1 && s[i] == s[i+1]){
                i++;
            }
            helper(s, i + 1, partialSol, result);

        }
    }

    public static void main(String[] args) {
        get_distinct_subsets("aab");
    }
}
