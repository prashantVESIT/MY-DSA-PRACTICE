// Minimum Size Subarray Sum (Medium)
// Problem Statement

// Given an array of positive integers nums and an integer target, return the minimum length of a contiguous subarray whose sum is greater than or equal to target.

// If there is no such subarray, return 0. 
public class Q60 {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 1, 1, 2, 3, 5 };
        int k = 9;
        int n = arr.length;
        int s = 0;
        int e = 0;
        int sum = 0;
        int size = Integer.MAX_VALUE;

        while (e < n) {
            sum += arr[e];

            while (sum >= k) {
                size = Math.min(size,( e - s + 1));
                sum -= arr[s];
                s++;
            }
            e++;
        }
        System.out.println(size);

    }

}
