https://leetcode.com/problems/relative-sort-array/

import java.util.*;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        int index = 0;

        for (int num : arr2) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == num) {
                    result[index++] = num;
                    arr1[i] = -1;
                }
            }
        }

        Arrays.sort(arr1);

        for (int num : arr1) {
            if (num != -1) {
                result[index++] = num;
            }
        }

        return result;
    }
}
