package com.regis.romantointeger;

public class SolutionImpl implements Solution {
    @Override
    public int romanToInt(String s) {
        // MMMXLV
        // 3045

        int output = 0;

        for (int i = 0; i < s.length(); i++) {

            switch (String.valueOf(s.charAt(i))) {
                case "I" -> output += 1;
                case "V" -> {
                    if (i > 0 && String.valueOf(s.charAt(i-1)).equals("I")) {
                        output -= 1;
                        output += 4;
                    } else {
                        output += 5;
                    }
                }
                case "X" -> {
                    if (i > 0 && String.valueOf(s.charAt(i-1)).equals("I")) {
                        output -= 1;
                        output += 9;
                    } else {
                        output += 10;
                    }
                }
                case "L" -> {
                    if (i > 0 && String.valueOf(s.charAt(i-1)).equals("X")) {
                        output -= 10;
                        output += 40;
                    } else {
                        output += 50;
                    }
                }
                case "C" -> {
                    if (i > 0 && String.valueOf(s.charAt(i-1)).equals("X")) {
                        output -= 10;
                        output += 90;
                    } else {
                        output += 100;
                    }
                }
                case "D" -> {
                    if (i > 0 && String.valueOf(s.charAt(i-1)).equals("C")) {
                        output -= 100;
                        output += 400;
                    } else {
                        output += 500;
                    }
                }
                case "M" -> {
                    if (i > 0 && String.valueOf(s.charAt(i-1)).equals("C")) {
                        output -= 100;
                        output += 900;
                    } else {
                        output += 1000;
                    }
                }
                default -> output += 0;
            }
        }

        return output;
    }
}
