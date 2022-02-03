package com.datastructures.arrays.string;

public class ExceSheetDecode {

    public int decode(String input){
        int result=0;

        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            result=result * 26 + c -'A'+1;
        }
        System.out.println(result);
        return result;
    }

    public String encode(int input) {
        String str = "";
        char source[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'L', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int i = input;

        while (i > 26) {
            int s=i-'Z';
            i = i / 26;
            str +='A';// Character.toString(source[i-1]);
        }
        if(i!=0)
        str += Character.toString(source[i-1]);

        System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
        ExceSheetDecode exceSheetDecode=new ExceSheetDecode();
        exceSheetDecode.decode("ZZ");
        exceSheetDecode.encode(27);
    }
}
