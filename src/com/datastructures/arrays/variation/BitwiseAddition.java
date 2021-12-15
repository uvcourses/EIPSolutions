package com.datastructures.arrays.variation;

public class BitwiseAddition {

    public String addDigit(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = str1.length() - 1, j = str2.length() - 1;

        while (i >= 0) {
            if (str1.charAt(i) == str2.charAt(j)) {
                if (str1.charAt(i) == '1') {
                    if (carry == 0) {
                        result.append(0);
                        carry = 1;
                    } else {
                        result.append(1);
                        carry = 1;
                    }
                } else {
                    if (carry == 0) {
                        result.append(0);
                        carry = 0;
                    } else {
                        result.append(1);
                        carry = 0;
                    }
                }
            } else {
                if (carry == 0) {
                    result.append(1);
                    carry = 0;
                } else {
                    result.append(1);
                    carry = 1;
                }
            }
            i--;
            j--;
        }
        if (carry == 1) {
            result.append(1);
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        BitwiseAddition bitwiseAddition = new BitwiseAddition();
        String addition = bitwiseAddition.addDigit("1111", "1111");
        System.out.println(addition);
    }
}
