package com.algo.backtracking;

import java.util.ArrayList;

public class PhoneCombo {
    static String[] numberPad = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "qrs", "tuv", "wxyz"};

    static ArrayList<String> get_words_from_phone_number(String phone_number) {
        // Write your code here.
        //String[] numberPad = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "qrs", "tuv", "wxyz"};
        ArrayList<String> result = new ArrayList<String>();
        int i = Integer.parseInt(String.valueOf(phone_number.charAt(0)));
        helper(phone_number, 0, numberPad[i], new StringBuilder(), result);
        return result;
    }
    private static void helper(String phone_number, int i, String master, StringBuilder partialSol, ArrayList<String> result) {
        if (partialSol.length() == phone_number.length()) {
            result.add(partialSol.toString());
            return;
        }
        if (i == phone_number.length()) {
            return;
        }
    }

    public static void main(String[] args) {
        get_words_from_phone_number("23");
    }
}
