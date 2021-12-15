package com.algo.backtracking;

import java.util.Arrays;

public class QueenProblem {

    public int[] solveQ(int n) {
        int[] result = new int[n];
        int ind = 0;
        result[0] = ind;
        for (int j = 0; j < n; j++) {
            if (isValid(result, ind)) {
                result[ind] = ind;
            }
            ind++;
        }
        return result;
    }

    public boolean isValid(int data[], int ind) {
        boolean result = true;
        for (int i = 0; i <= ind; i++) {
            if (data[i] == ind) {
                return false;
            }
        }
        return result;
    }

    public static void main(String arg[]) {
        // recursive approach
        // backtracking
        // store all possible option in a array
        // a[i]={1,3,0,2};
        QueenProblem q = new QueenProblem();
        q.solveQ(4);
        /*
       data[0]     0 X 0 0
       data[1]     0 0 0 X
       data[2]     X 0 0 0
       data[3]     0 0 X 0
         */
    }
}
