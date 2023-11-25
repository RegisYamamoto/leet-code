package com.regis.longestcommonprefix;

import java.util.Arrays;

public class SolutionImpl implements Solution {
    @Override
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String firstString = strs[0];
        String lastString = strs[strs.length-1];
        int count = 0;

        for (int i = 0; i < firstString.length(); i++) {
            if (firstString.charAt(count) == lastString.charAt(count)) {
                count ++;
            } else {
                break;
            }
        }

        return count == 0 ? "" : firstString.substring(0, count);
    }
}
