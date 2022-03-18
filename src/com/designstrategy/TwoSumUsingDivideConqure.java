package com.designstrategy;

import javax.security.auth.login.CredentialException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSumUsingDivideConqure {

    private void twoSum(ArrayList<Integer> array, int start, int end, int target, ArrayList<Integer> result) {

        if (start == end) {
            return;
        }
        int mid = (start + end) / 2;
        twoSum(array, start, mid, target, result);
        twoSum(array, mid + 1, end, target, result);

        int i = start;
        int j = mid+1;
        int k=end;

        while (i <= mid && k>=j) {
            int sum = array.get(i) + array.get(k);
            if (sum == target) {
                result.set(0, i);
                result.set(1, k);
                return;
            } else if (sum > target) {
                k--;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        TwoSumUsingDivideConqure twoSumUsingDivideConqure = new TwoSumUsingDivideConqure();
        ArrayList<Integer> result = new ArrayList<>();
        result.add(0, -1);
        result.add(1, -1);
        List<Integer> arrayList = Arrays.asList(-7, -6, 0, 0, 8, 9, 10);
        twoSumUsingDivideConqure.twoSum(new ArrayList<>(arrayList), 0, arrayList.size() - 1, 0, result);
        System.out.println(result.get(0));
        System.out.println(result.get(1));
    }
}
