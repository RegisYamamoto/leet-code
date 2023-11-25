package com.regis.romantointeger;

public class Main {

    private static Solution solution = new SolutionImpl();

    public static void main(String[] args) {
        int result = solution.romanToInt("MMMXLV");

        if (result == 3045) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
            System.out.println("result: " + result);
        }
    }

}
