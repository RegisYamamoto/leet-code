package com.regis.mergesortedarray;

public class Main {

    private static Solution solution = new SolutionImpl();

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        solution.merge(nums1, m, nums2, n);
    }

}
