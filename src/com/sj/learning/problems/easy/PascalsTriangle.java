package com.sj.learning.problems.easy;

public class PascalsTriangle {
    public static void main(String[] args) {
        int level = 6;
        int[][] array = pascalsTriangle(level);
        System.out.print("[");
        for (int i=0; i < level; i++) {
            System.out.print("[");
            for (int j=0; j< level; j++) {
                if (array[i][j] == 0) continue;
                if (j != 0) System.out.print(", ");
                System.out.print(array[i][j]);
            }
            System.out.print("]");
        }
        System.out.print("]");
    }

    static int[][] pascalsTriangle(int n) {
        int array[][] = new int[n][n];
        array[0][0] = 1;
        if (n == 1 ) return array;
        array[1][0] = 1;
        array[1][1] = 1;
        if (n == 2) return array;
        for (int i = 2; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    array[i][j] = 1;
                    continue;
                }
                if (j == i) {
                    array[i][j] = 1;
                    continue;
                }
                array[i][j] = array[i-1][j-1] + array[i-1][j];
            }
        }
        return array;
    }


}
