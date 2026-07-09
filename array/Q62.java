// Maximum Consecutive Ones III

// Problem Description

// You are given a binary array arr containing only 0s and 1s, and an integer k.

// You are allowed to flip at most k zeros into ones.

// Find the length of the longest contiguous subarray containing only 1s after performing at most k flips.
public class Q62 {
    public static void main(String[] args) {
        int [] arr = {0,0,1,0,1,0,1,0};
        int k = 2;//Number of zeros that can be flipped
        int n = arr.length;
        int s =0;
        int e =0;
        int zeroCount = 0;
        int maxLen = 0;

        while(e<n){
            if(arr[e]==0){
                zeroCount++;
            }

            while(zeroCount>k){
                
                if(arr[s]==0){
                    zeroCount--;
                }
                s++;
            }

            
            maxLen = Math.max(maxLen,(e-s+1));
            

            e++;
        }
        System.out.println(maxLen);

    }
}
