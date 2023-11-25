package com.regis.twosum;

public class Main {

    private static Solution solution = (Solution) new SolutionImpl();

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] indices = solution.twoSum(nums, 9);
        System.out.println("indices[0]: " + indices[0]);
        System.out.println("indices[1]: " + indices[1]);

        if (indices[0] == 0 && indices[1] == 1) {
            System.out.println("OK");
        } else {
            System.out.println("Error");
        }
    }





}
