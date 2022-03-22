package com.algo.backtracking;

import java.util.ArrayList;
import java.util.Collections;

public class Permutation {
    static ArrayList<ArrayList<Integer>> get_permutations(ArrayList<Integer> arr) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> partialSol = new ArrayList<Integer>();

        permuteHelper(arr, 0, partialSol, result);
        System.out.println(result);
        return result;
    }

    private static void permuteHelper(ArrayList<Integer> arr, int i, ArrayList<Integer> partialSol, ArrayList<ArrayList<Integer>> result) {

        if (i == arr.size()) {
            ArrayList<Integer> temp= (ArrayList<Integer>) partialSol.clone();
            result.add(temp);
            return;
        } else {
            for (int pick = i; pick < arr.size(); pick++) {
                Collections.swap(arr, pick, i);
                partialSol.add(arr.get(i));
                permuteHelper(arr, i + 1, partialSol, result);
                partialSol.remove(arr.get(i));
                Collections.swap(arr, pick, i);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        get_permutations(input);
    }
}
