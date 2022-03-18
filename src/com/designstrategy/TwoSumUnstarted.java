package com.designstrategy;

import java.util.*;

public class TwoSumUnstarted {

    public static void main(String[] args) {
        TwoSumUnstarted twoSumUsingDivideConqure = new TwoSumUnstarted();
        ArrayList<Integer> result = new ArrayList<>();

        Hashtable<Integer,Integer> cache=new Hashtable<Integer,Integer>();

        Map<Integer,Integer> map=new HashMap<>();
        cache.put(1,251);
        cache.put(2,251);
        cache.put(3,251);
        cache.put(4,251);

        map.put(1,251);
        map.put(2,251);
        map.put(3,251);
        map.put(4,251);


        System.out.println(map);
        System.out.println();




        result.add(0, -1);

        result.add(1, -1);
        List<Integer> arrayList = Arrays.asList(-1, 3, 11, 6, 5);
       // twoSumUsingDivideConqure.helper(new ArrayList<>(arrayList), 8, 0,arrayList.size() - 1, result);


        System.out.println(result.get(0));
        System.out.println(result.get(1));
    }

    public static void helper(ArrayList<Integer> numbers,Integer target,Integer start,Integer end,ArrayList<Integer> result){

        if(start==end){
            return;
        }

        int mid=(start+end)/2;

        helper(numbers,target,start,mid,result);
        helper(numbers,target,mid+1,end,result);

        int i=start;
        int j=mid+1;

        while(i<=mid) {
            while(j<=end){
                int sum=numbers.get(i) + numbers.get(j);

                if(sum==target){
                    result.set(0,i);
                    result.set(1,j);
                    return;
                }
                j++;
            }
            j=mid+1;
            i++;
        }
    }
}
