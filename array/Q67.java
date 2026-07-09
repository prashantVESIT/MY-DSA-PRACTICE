// Subarray Sum Equals K
// Problem Statement

// Given an integer array nums and an integer k, return the total number of continuous subarrays whose sum equals k.

// A subarray is a contiguous, non-empty sequence of elements within an array.

// Note: The array may contain positive, negative, and zero values.

import java.util.*;
public class Q67 {
    public static void main(String[] args) {
        int [] arr = {1,-1,0,1,2,-1,3};
        int n = arr.length;
        int k = 3;
        int sum = 0;
        int count = 0;
        Map<Integer,Integer> m = new HashMap<>();
        m.put(0,1);

        for(int i =0;i<n;i++){
            sum+=arr[i];
            m.put(sum,m.getOrDefault(sum,0)+1);
            int target = sum - k;

            if(m.containsKey(target)){
                count += m.get(target);
            }
        }
        System.out.println(count);
        
    }
}
