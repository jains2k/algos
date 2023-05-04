package com.sj.learning.problems.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {
    public static void main(String[] args) {
        int level = 5;
        List<Integer> list = pascalsTriangle(level);
        System.out.print("[");
        int j=0;
        for (Integer integer: list) {
            if (j != 0) System.out.print(", ");
            System.out.print(integer);
            j++;
        }
        System.out.print("]");
    }

    static List<Integer> pascalsTriangle(int rowIndex) {
        if (rowIndex < 0) return null;
        List<Integer> prev = new ArrayList<>(rowIndex);
        prev.add(1);
        if (rowIndex == 0) return prev;
        prev.add(1);
        if (rowIndex == 1) return prev;

        List<Integer> list = null;
        for (int i=2 ; i <= rowIndex; i ++) {
            list = new ArrayList<>();
            list.add(1);
            for (int j = 1; j < i; j++) {
                list.add(prev.get(j-1) + prev.get(j));
            }
            list.add(1);
            prev = list;
        }
        return list;
    }
}
