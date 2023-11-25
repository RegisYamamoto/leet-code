package com.regis.palindromenumber;

public class Main {

    public static Solution solution = (Solution) new SolutionImpl();

    public static void main(String[] args) {
        boolean result = solution.isPalindrome(121);

        if (result) {
            System.out.println("OK");
        } else {
            System.out.println("Error");
        }
    }

}
