package com.datastructures.linkedlist;

import java.util.ArrayList;
import java.util.Collections;

public class PhoneNumberPermute {
    static String [] numberPad=new String[]{ "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static ArrayList<String> get_words_from_phone_number(String phone_number) {
        // Write your code here.

        ArrayList<String> result=new ArrayList<String>();
        helper(phone_number,0,new StringBuilder(),result);
       // result.add("b");
        if(result.size()==1){
            result.clear();
            result.add("-1");
            return result;
        }
        Collections.sort(result);
        return result;
    }
    private static void helper(String phone_number,int i,StringBuilder partialSol,ArrayList<String> result){

        if(i==phone_number.length()){
            result.add(partialSol.toString());
            return;
        }
        int digit= phone_number.charAt(i)-'0';
        if(digit==0 || digit==1) {
            helper(phone_number,i+1,partialSol,result);
            return;
        }
        String options=numberPad[digit];
        for(int pick =0;pick<options.length();pick++){
            partialSol.append(options.charAt(pick));
            helper(phone_number,i+1,partialSol,result);
            partialSol.deleteCharAt(partialSol.length()-1);
        }
    }
    public static void main(String[] args) {
        get_words_from_phone_number("23");
    }
}
