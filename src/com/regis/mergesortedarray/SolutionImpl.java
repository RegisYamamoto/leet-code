package com.regis.mergesortedarray;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SolutionImpl implements Solution {
    @Override
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] tempArray = new int[m + n];
        int largerArrayLength = 0;
        int j = 0;

        if (nums1.length >= nums2.length) {
            largerArrayLength = nums1.length;
        } else {
            largerArrayLength = nums2.length;
        }

        for (int i = 0; i < largerArrayLength; i++) {
            if (i < nums1.length && nums1[i] != 0) {
                tempArray[j] = nums1[i];
                j++;
            }
            if (i < nums2.length && nums2[i] != 0) {
                tempArray[j] = nums2[i];
                j++;
            }
        }

        tempArray = Arrays.stream(tempArray).sorted().toArray();

        for (int i = 0; i < tempArray.length; i++) {
            nums1[i] = tempArray[i];
        }


        // Expected [1,2,2,3,5,6]
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }

}
