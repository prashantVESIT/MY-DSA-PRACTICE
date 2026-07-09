// Question: Count Number of Nice Subarrays
// Problem Statement

// You are given an integer array nums and an integer k.

// A nice subarray is a contiguous subarray that contains exactly k odd numbers.

// Return the number of nice subarrays.

public class Q65 {
    static int countAtmost(int[] arr, int goal) {

        if (goal < 0) {
            return 0;
        }
        int n = arr.length;
        int s = 0;
        int e = 0;
        int oddCount = 0;
        int subArrayCount = 0;

        while (e < n) {
            if ((arr[e] & 1) != 0) {
                oddCount++;
            }

            while (oddCount > goal) {
                if ((arr[s] & 1) != 0) {
                    oddCount--;
                }
                s++;

            }

            subArrayCount += e - s + 1;
            e++;
        }
        return subArrayCount;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 2 };
        int goal = 0;

        int subArray = countAtmost(arr, goal) - countAtmost(arr, goal - 1);
        System.out.println(subArray);

    }
}
