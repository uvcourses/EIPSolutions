package com.dp;

import java.util.ArrayList;
import java.util.Arrays;

public class HouseJumping {
    private boolean can_reach_last_house(ArrayList<Integer> maximum_jump_lengths) {
        boolean isFurthestReachable[]=new boolean[maximum_jump_lengths.size()];
        Arrays.fill(isFurthestReachable,false);
        isFurthestReachable[maximum_jump_lengths.size()-1]=true;

        for(int i=maximum_jump_lengths.size()-2;i>=0;i--){
            for(int j=i+1;j<=i+maximum_jump_lengths.get(i);j++){
                if(isFurthestReachable[j]){
                    isFurthestReachable[i]=true;
                    break;
                }
            }
        }
        return isFurthestReachable[0];
    }
    public static void main(String[] args) {
        HouseJumping houseJumping=new HouseJumping();
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(2);arrayList.add(3);arrayList.add(1);arrayList.add(0);arrayList.add(4);arrayList.add(7);
        houseJumping.can_reach_last_house(arrayList);
    }
}
