package com.regis.longestcommonprefix;

public class Main {

    private static Solution solution = new SolutionImpl();

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

        String result = solution.longestCommonPrefix(strs);

        if (result.equals("fl")) {
            System.out.println("OK");
            System.out.println("result: " + result);
        } else {
            System.out.println("ERROR");
            System.out.println("result: " + result);
        }
    }

}
