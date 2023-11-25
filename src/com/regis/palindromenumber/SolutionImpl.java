package com.regis.palindromenumber;

public class SolutionImpl implements Solution {
    @Override
    public boolean isPalindrome(int x) {
        String inputString = String.valueOf(x);
        String reverseInputString = "";

        for (int i = inputString.length() -1; i >= 0; i--) {
            reverseInputString += inputString.charAt(i);
            System.out.println(inputString.charAt(i));
        }

        System.out.println(reverseInputString);

        if (inputString.equals(reverseInputString)) {
            return true;
        }

        return false;
    }

}
