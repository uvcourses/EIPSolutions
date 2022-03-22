package com.algo.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class NChooseCombination {
    static ArrayList<ArrayList<Integer>> find_combinations(Integer n, Integer k) {
        // Write your code here.
       // ArrayList<Integer> partialSol=new ArrayList<Integer>();
        HashSet<Integer> partialSol=new HashSet<>();
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        combination(n,k,0,partialSol,result);
        System.out.println(result);
        return result;
    }

    private static void combination(Integer n, Integer k, Integer i, HashSet<Integer> partialSol , ArrayList<ArrayList<Integer>> result){

        if(partialSol.size()==k){
            ArrayList<Integer> temp=new ArrayList<>(partialSol);
            result.add(temp);
            return;
        }
        if(i==n){
            return;
        }
                combination(n, k, i + 1, partialSol, result);
                partialSol.add(i+1);
                combination(n, k, i + 1, partialSol, result);
                partialSol.remove(i+1);
        }
    public static void main(String[] args) {
        find_combinations(5,2);
    }
}
