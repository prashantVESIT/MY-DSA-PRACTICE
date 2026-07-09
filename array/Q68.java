// Maximum Size Subarray Sum Equals K (LeetCode 325)

// Given an integer array nums and an integer k, return the maximum length of a contiguous subarray whose sum equals k.

// If there is no such subarray, return 0.

import java.util.*;

public class Q68 {
    public static void main(String[] args) {
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, -1);
        int[] arr = { 2, -1, 2, 3, -2, 4, -3, 1 };
        int n = arr.length;
        int k = 5;
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            int element = sum - k;
            if (m.containsKey(element)) {
                maxLen = Math.max(maxLen, (i - m.get(element)));
            }
            if (!m.containsKey(sum)) {
                m.put(sum, i);
            }
        }
        System.out.println(maxLen);

    }
}
