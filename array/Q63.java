// Maximum Erasure Value (Maximum Sum of a Unique Subarray)

// Problem Description

// You are given an integer array arr.

// Find the maximum possible sum of a contiguous subarray in which all elements are unique (no duplicates).

// Return the maximum sum.

import java.util.*;
public class Q63 {
    public static void main(String[] args) {

        Map<Integer,Integer> m = new HashMap<>();
        int [] arr = {5,2,1,3,2,5,2,1,4,7};
        // MAX = (5+2+1+4+7=19)
        int n = arr.length;
        int s=0;
        int e =0;
        int sum =0;
        int maxSum =0;

        while(e<n){
            sum+=arr[e];
            m.put(arr[e],m.getOrDefault(arr[e],0)+1);

            while(m.get(arr[e])>1){
                sum-=arr[s];
                m.put(arr[s],m.get(arr[s])-1);
                s++;
            }
            maxSum = Math.max(maxSum,sum);
            e++;


        }
        System.out.println(maxSum);
    }
}
