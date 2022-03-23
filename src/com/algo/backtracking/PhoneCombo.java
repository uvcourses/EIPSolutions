package com.algo.backtracking;

import java.util.ArrayList;

public class PhoneCombo {

    static ArrayList<String> get_words_from_phone_number(String phone_number) {
        // Write your code here.
        String[] numberPad = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "qrs", "tuv", "wxyz"};
        ArrayList<String> result = new ArrayList<String>();
        int i=phone_number.indexOf(0);
        helper(phone_number, 0, numberPad[i], new StringBuilder(), result);
        return result;
    }

    private static void helper(String phone_number, int i, String master, StringBuilder partialSol, ArrayList<String> result) {
        String[] numberPad = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "qrs", "tuv", "wxyz"};

        if (partialSol.length() == phone_number.length()) {
            result.add(partialSol.toString());
            return;
        }
        if (i == phone_number.length()) {
            return;
        }

        for (int pick = i; pick < phone_number.length(); pick++) {
            if ( !(phone_number.charAt(i) == '1') || ! (phone_number.charAt(i) == '0')) {
                partialSol.append(master.charAt(pick));
                helper(phone_number, i + 1, numberPad[phone_number.charAt(i + 1)], partialSol, result);
                partialSol.deleteCharAt(partialSol.length() - 1);
            }
        }

    }

    public static void main(String[] args) {
        get_words_from_phone_number("1234567");
    }
}
