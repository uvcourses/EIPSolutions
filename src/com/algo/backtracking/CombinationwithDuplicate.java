package com.algo.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CombinationwithDuplicate {
    static ArrayList<ArrayList<Integer>> get_permutations(ArrayList<Integer> arr) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> partialSol=new ArrayList<Integer>();
        permuteWithDuplicate(arr,0,partialSol,result);
        System.out.println(result);
        return result;
    }

    public static void permuteWithDuplicate(ArrayList<Integer> arr, int i, ArrayList<Integer> partialSol, ArrayList<ArrayList<Integer>> result){
         HashSet<Integer> hashSet=new HashSet<>();

        if(i==arr.size()) {
            result.add((ArrayList<Integer>) partialSol.clone());
            return;
        }
        for(int pick=i;pick<arr.size();pick++){
            if (hashSet.contains(arr.get(pick))) {
                continue;
            }
                Collections.swap(arr, pick, i);
                partialSol.add(arr.get(i));
                permuteWithDuplicate(arr, i + 1, partialSol, result);
                partialSol.remove(arr.get(i));
                Collections.swap(arr, pick, i);
                hashSet.add(arr.get(pick));
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> input=new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(1);
        get_permutations(input);
    }
}
