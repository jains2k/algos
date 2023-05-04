package com.sj.learning.problems.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleList {
    public static void main(String[] args) {
        int level = 6;
        List<List<Integer>> list = pascalsTriangle(level);
        System.out.print("[");
        for (List<Integer> subList: list) {
            System.out.print("[");
            int j=0;
            for (Integer integer: subList) {
                if (j != 0) System.out.print(", ");
                System.out.print(integer);
                j++;
            }
            System.out.print("]");
        }
        System.out.print("]");
    }

    static List<List<Integer>> pascalsTriangle(int n) {
        if (n <= 0) return null;
        List<List<Integer>> list = new ArrayList<>(n);
        ArrayList<Integer> subList = new ArrayList<>();
        subList.add(1);
        list.add(subList);
        if (n == 1) return list;
        ArrayList<Integer> prev = new ArrayList<>();
        prev.add(1);
        prev.add(1);
        list.add(prev);
        if (n == 2) return list;

        for (int i=2 ; i < n; i ++) {
            subList = new ArrayList<>();
            list.add(subList);
            subList.add(1);
            for (int j = 1; j < i; j++) {
                subList.add(prev.get(j-1) + prev.get(j));
            }
            subList.add(1);
            prev = subList;
        }
        return list;
    }
}
