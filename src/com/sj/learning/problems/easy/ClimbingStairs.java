package com.sj.learning.problems.easy;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(30));
        System.out.println(climbStairsNonRecursive(30));

        System.out.println(climbStairs(5));
        System.out.println(climbStairsNonRecursive(5));
    }

    static int climbStairs(int n) {
        if (n <=2 ) return n;
        return climbStairs(n-1) + climbStairs(n-2);
    }

    static int climbStairsNonRecursive(int n) {
        if (n <=2 ) return n;
        int[] a = new int[n];
        a[0] = 1;
        a[1] = 2;

        for (int i=2; i< n ; i++) {
            a[i] = a[i-1] + a[i-2];
        }
        return a[n-1];
    }
}
