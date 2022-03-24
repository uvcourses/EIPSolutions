package com.algo.backtracking;

import java.util.ArrayList;
import java.util.Collections;

public class TargetSumUsing {
    static ArrayList<ArrayList<Integer>> generate_all_combinations(ArrayList<Integer> arr, Integer target) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        Collections.sort(arr);
        helper(arr,target,0,0,new ArrayList<Integer>(),result);
        System.out.println(result);
        return result;
    }
    private static void helper(ArrayList<Integer> arr,int target,int i,int runningSum,ArrayList<Integer> partialSol,ArrayList<ArrayList<Integer>> result ){
        if(target==runningSum){
            ArrayList<Integer> temp= (ArrayList<Integer>) partialSol.clone();
            result.add(temp);
            return;
        }
        if(runningSum>target){
            return;
        }
        if(i==arr.size()){
            return;
        }
        partialSol.add(arr.get(i));
        helper(arr,target,i+1,arr.get(i)+runningSum,partialSol,result);
        partialSol.remove(partialSol.size()-1);
        while(i<arr.size()-1 && arr.get(i)==arr.get(i+1)){
            i++;
        }
        helper(arr,target,i+1,runningSum,partialSol,result);

    }
    public static void main(String[] args) {
        ArrayList<Integer> newIndex=new ArrayList<>();
        newIndex.add(1);
        newIndex.add(2);
        newIndex.add(3);
        generate_all_combinations(newIndex,3);
    }
}
