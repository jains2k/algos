package com.sj.learning.problems.medium;

public class MostWater {

    public static void main(String[] args) {
        int[] heights = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxAreaFirstAttempt(heights));
        System.out.println(maxAreaOptimal(heights));

        heights = new int[]{1,1};
        System.out.println(maxAreaFirstAttempt(heights));
        System.out.println(maxAreaOptimal(heights));

    }
    public static int maxAreaFirstAttempt(int[] height) {
        int maxArea = 0;
        for (int i=0; i< height.length; i++) {
            for (int j=i+1; j<height.length; j++) {
                int min = minimum(height[i], height[j]);
                int area = min * (j - i);
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }

    public static int minimum(int a, int b) {
        return a < b? a: b;
    }

    public static int maxAreaOptimal(int[] height) {
        int maxArea = 0;
        int j = height.length - 1;
        for (int i=0; i < height.length;) {
            int min = minimum(height[i], height[j]);
            int area = min * (j-i);
            if (area > maxArea) maxArea = area;
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
            if (i>=j) return maxArea;
        }
        return maxArea;
    }
}
