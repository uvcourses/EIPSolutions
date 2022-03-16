package com.algo.backtracking.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class DutchNationFlag {
    static ArrayList<Character> dutch_flag_sort(ArrayList<Character> balls) {

        // Write your code here.

        int start=0;
        int mid=0;
        int end=balls.size()-1;
        int i=0;
        while(i<=end) {

            if(balls.get(i)=='R') {
                Character temp= balls.get(i);
                balls.set(i,balls.get(start));
                balls.set(start,temp);
                start++;
                i++;
            }else if(balls.get(i)=='B'){
                Character temp= balls.get(i);
                balls.set(i,balls.get(end));
                balls.set(end,temp);
                end--;
            }else {
                Character temp= balls.get(i);
                balls.set(i,balls.get(mid));
                balls.set(mid,temp);
                mid++;
                i++;
            }

        }
        return new ArrayList();
    }
    public static void main(String[] args) {
        dutch_flag_sort(new ArrayList<Character>(Arrays.asList('G', 'B', 'G', 'G', 'R', 'B', 'R', 'G')));

    }
}
