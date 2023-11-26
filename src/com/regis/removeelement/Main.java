package com.regis.removeelement;

public class Main {

    private static Solution solution = new SolutionImpl();

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 2;

        int result = solution.removeElement(nums, val);

        if (result == 2) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }

        for (int i = 0; i < val; i++) {
            if (nums[i] != val) {
                System.out.println("OK");
            } else {
                System.out.println("ERROR");
            }
        }
    }

}
