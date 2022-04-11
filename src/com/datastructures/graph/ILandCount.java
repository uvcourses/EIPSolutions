package com.datastructures.graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ILandCount {




    static Integer count_islands(ArrayList<ArrayList<Integer>> matrix) {
        // Write your code here.
        int row=matrix.size();
        int col=matrix.get(0).size();
        int island=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;++j){

                if(matrix.get(i).get(j)==1) {
                    ++island;
                    bfs(matrix, i, j);
                }
            }
        }
        System.out.println(island);
        return island;
    }
    static void bfs(ArrayList<ArrayList<Integer>> matrix , int x, int y){
        Queue<int []> queue=new LinkedList<>();
        queue.add(new int[] {x,y});
        while(!queue.isEmpty()){
            int a[]= queue.poll();
            matrix.get(a[0]).set(a[1],0);
            // left
            if( a[0]-1 >=0 && matrix.get(a[0]-1).get(a[1])==1 ){
                queue.add(new int[] {a[0]-1,a[1]});
                matrix.get(a[0]-1).set(a[1],0);
            }
            // right
            if(a[0]+1 < matrix.size() && matrix.get(a[0]+1).get(a[1])==1 ){
                queue.add(new int[] {a[0]+1,a[1]});
                matrix.get(a[0]+1).set(a[1],0);

            }

            // Up
            if(a[1]-1 >=0 && matrix.get(a[0]).get(a[1]-1)==1){
                queue.add(new int[] {a[0],a[1]-1});
                matrix.get(a[0]).set(a[1]-1,0);
            }
            //Down
            if(a[1]+1 < matrix.get(0).size() && matrix.get(a[0]).get(a[1]+1)==1 ){
                queue.add(new int[] {a[0],a[1]+1});
                matrix.get(a[0]).set(a[1]+1,0);
            }
            //  upleft
            if(a[0]-1 >=0 && a[1]-1>=0 && matrix.get(a[0]-1).get(a[1]-1)==1){
                queue.add(new int[] {a[0]-1,a[1]-1});
                matrix.get(a[0]-1).set(a[1]-1,0);

            }

            //upright
            if(a[0]+1 <matrix.size() && a[1]-1 >=0 && matrix.get(a[0]+1).get(a[1]-1)==1){
                queue.add(new int[] {a[0]+1,a[1]-1});
                matrix.get(a[0]+1).set(a[1]-1,0);
            }

            // leftDown
            if(a[0]-1 >=0 && a[1]+1 < matrix.get(0).size() && matrix.get(a[0]-1).get(a[1]+1)==1){
                queue.add(new int[] {a[0]-1,a[1]+1});
                matrix.get(a[0]-1).set(a[1]+1,0);
            }

            //rightDown
            if(a[0]+1 <matrix.size() && a[1]+1 < matrix.get(0).size() && matrix.get(a[0]+1).get(a[1]+1)==1){
                queue.add(new int[] {a[0]+1,a[1]+1});
                matrix.get(a[0]+1).set(a[1]+1,0);
            }

        }

    }
    public static void main(String[] args) {
       ArrayList<ArrayList<Integer>> input=new ArrayList<>();
       ArrayList<Integer> ro1=new ArrayList<>(Arrays.asList(1, 1, 0, 0, 0));
        ArrayList<Integer> ro2=new ArrayList<>(Arrays.asList(0, 1, 0, 0, 1));
        ArrayList<Integer> ro3=new ArrayList<>(Arrays.asList(1, 0, 0, 1, 1));
        ArrayList<Integer> ro4=new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
        ArrayList<Integer> ro5=new ArrayList<>(Arrays.asList(1, 0, 1, 0, 1));
       input.add(ro1);
        input.add(ro2);
        input.add(ro3);
        input.add(ro4);
        input.add(ro5);

        count_islands(input);
    }
}
