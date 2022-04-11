package com.datastructures.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class KnightMove {
    static int no_of_moves = 8;
    static int add_rows[] = {-2, -2, -1, 1, 2, 2, 1, -1};
    static int add_cols[] = {-1, 1, 2, 2, 1, -1, -2, -2};

    static Integer find_minimum_number_of_moves(Integer rows, Integer cols, Integer start_row, Integer start_col, Integer end_row, Integer end_col) {

        if(start_row==end_row && start_col==end_col){
            return 0;
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start_row, start_col});
        int dist[][] = new int[rows][cols];
        //Arrays.fill(dist, -1);
        for (int[] row : dist)
            Arrays.fill(row, -1);
        dist[start_row][start_col] = 0;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int currx = cur[0];
            int curry = cur[1];

            for (int i = 0; i < no_of_moves; i++) {
                int new_x = currx + add_rows[i];
                int new_y = curry + add_cols[i];

                if (isvalidPosition(rows, cols, new_x, new_y)) {
                    if (dist[new_x][new_y] == -1) {
                        dist[new_x][new_y] = dist[currx][curry] + 1;
                        if (new_x == end_row && new_y == end_col) {
                            return dist[new_x][new_y];
                        }
                        queue.add(new int[] {new_x,new_y});
                    }
                }
            }
        }
        return -1;
    }

    static boolean isvalidPosition(int row, int col, int new_row, int new_col) {
        return ((new_row >= 0) && (new_row < row) && (new_col >= 0 && new_col < col));
    }

    public static void main(String[] args) {
        find_minimum_number_of_moves(5,5,0,0,4,1);
    }
}
