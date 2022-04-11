package com.datastructures.graph;

import java.util.ArrayList;

public class FloodFill {

    static ArrayList<ArrayList<Integer>> flood_fill(Integer pixel_row, Integer pixel_column, Integer new_color, ArrayList<ArrayList<Integer>> image) {
        // Write your code here.

        int old_color=image.get(pixel_row).get(pixel_column);
        if(old_color==new_color){
            return image;
        }
        dfs(pixel_row,pixel_column,old_color,new_color,image);
        return image;
    }


    static void dfs(Integer x, Integer y,Integer old_color, Integer new_color,ArrayList<ArrayList<Integer>> image){

        image.get(x).set(y,new_color);

        // left
        if(x-1 >=0 && image.get(x-1).get(y)==old_color){
            dfs(x-1,y,old_color,new_color,image);

        }
        // Right
        if(x+1 < image.size() && image.get(x+1).get(y)==old_color){
            dfs(x+1,y,old_color,new_color,image);

        }
        // up
        if(y+1 < image.get(0).size() && image.get(x).get(y+1)==old_color){
            dfs(x,y+1,old_color,new_color,image);

        }
        // down

        if(y-1 >=0 && image.get(x).get(y-1)==old_color){
            dfs(x,y-1,old_color,new_color,image);
        }

    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> image=new ArrayList<>();
        ArrayList<Integer> row1=new ArrayList<>();
        ArrayList<Integer> row2=new ArrayList<>();
        ArrayList<Integer> row3=new ArrayList<>();
        row1.add(7);row1.add(7);row1.add(7);row1.add(7);row1.add(7);row1.add(7);
      //  row1.add(1);row2.add(1);row2.add(1);
      //  row3.add(1);row3.add(5);row3.add(4);
        image.add(row1);//image.add(row2);image.add(row3);
        flood_fill(0,4,7,image);
    }
}
