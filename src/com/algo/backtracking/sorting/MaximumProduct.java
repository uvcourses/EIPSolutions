package com.algo.backtracking.sorting;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumProduct {
    static int maxResultSoFar = Integer.MIN_VALUE;

    public static int maxProd(List<Integer> products) {

        for (int i = products.size() - 1; i >=0; i--) {
            List<Integer> aux = new ArrayList<>();
            for(int k=0;k<i+1;k++){
                aux.add(-1);
            }
            aux.set(i,products.get(i));
            for (int j = i; j >0; j--) {
                if (products.get(j - 1) >= aux.get(j)) {
                    aux.set (j-1,aux.get(j) - 1);
                } else {
                    aux.set(j-1,products.get(j - 1));
                }
            }
            maxResultSoFar=  Math.max(maxResultSoFar, sum(aux));
        }
        System.out.println(maxResultSoFar);
        return maxResultSoFar;
    }
// O(n ^ 2 * O(k))

    // O(n) + O(n) 2 O(n) * O(n)  = O(n^2)
    public static int sum(List<Integer> sum) {
        int tempResult = 0;
        System.out.println();
        for (int i : sum) {
            System.out.print(i+" " );
            tempResult += i;
        }
        return tempResult;
    }

    public static void main(String[] args) {
        ArrayList<Integer> input=new ArrayList<>();
        input.add(30);input.add(4);input.add(5);input.add(2);input.add(6);input.add(5);
        maxProd(input);
    }
}
