// BINARY SUBARRAY WITH SUM 

// You are given a binary array nums (an array containing only 0s and 1s) and an integer goal.

// Return the number of non-empty contiguous subarrays whose sum is exactly equals to goal.

// A subarray is a contiguous part of an array.
// PATTERN : required subArray = subarray having sum atleast upto goal - 
//                               subarray having sum atleast upto (goal-1)

public class Q64 {
    static int countAtmost(int [] arr,int goal){
        if(goal<0){
            return 0;
        }

        int n = arr.length;
        int count = 0;
        int s =0;
        int e =0;
        int sum =0;

        while(e<n){
            sum+= arr[e];

            while(sum>goal){
                sum -= arr[s];
                s++;
            }

            count += e-s+1;
            e++;
        }
        return count;

    }
    public static void main(String[] args) {
        int [] arr = {1,0,1,0,1,0,1};
        int goal = 2;
        
        int target1 = countAtmost(arr,goal);
        int target2 = countAtmost(arr,goal-1); 
    

        int subArray = target1 - target2;
        System.out.println(subArray);
        
    }
}
