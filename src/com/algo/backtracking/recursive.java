package com.algo.backtracking;

public class recursive {

    public void rearrangeString(String input,int n){

        if(n==input.length())
        {
            return;
        }
        rearrangeString(input,n+1);
        rearrangeString(input,n+1);
        System.out.print(input.charAt(n));

    }

    public static void main(String arg[]) {
        recursive r =new recursive();
        String input="ab";
        r.rearrangeString(input,0);
        // abc , acb, bac , cab , cab , bca
    }
}
