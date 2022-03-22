package com.algo.backtracking;

import java.util.ArrayList;

public class LetterPermutation {
    static ArrayList<String> letter_case_permutations(String s) {
        // Write your code here.
        ArrayList<String> result = new ArrayList<String>();
        String partialSol = new String();

        permuteLetter(s, partialSol, 0, result);
        return result;
    }


    private static void permuteLetter(String s, String partialSol, int i, ArrayList<String> result) {
        //Base Case
        if (i == s.length()) {
            result.add(partialSol.toString());
            return;
        }
        if (Character.isDigit(s.charAt(i))) {
            permuteLetter(s, partialSol + s.charAt(i), i + 1, result);
        } else {
            permuteLetter(s, partialSol + Character.toLowerCase(s.charAt(i)), i + 1, result);
            permuteLetter(s, partialSol + Character.toUpperCase(s.charAt(i)), i + 1, result);

        }

    }

    public static void main(String[] args) {
        LetterPermutation letterPermutation = new LetterPermutation();
        letter_case_permutations("a1z");
    }
}
