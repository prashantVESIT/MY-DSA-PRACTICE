// Question: Subarrays with K Different Integers
// Problem Statement

// You are given an integer array nums and an integer k.

// Return the number of contiguous subarrays that contain exactly k distinct integers.

// A subarray is a contiguous part of the array.
import java.util.*;
public class Q66 {
    static int countAtmost(int [] arr, int goal){
        if(goal<0){
            return 0;
        }
        Map<Integer,Integer> m = new HashMap<>();
        int n = arr.length;
        int s =0;
        int e =0;
        int count = 0;

        while(e<n){
            m.put(arr[e],m.getOrDefault(arr[e],0)+1);

            while(m.size()>goal){
                if(m.get(arr[s])==1){
                    m.remove(arr[s]);
                }
                else{
                    m.put(arr[s],m.get(arr[s])-1);
                }
                s++;
            }
            count += e-s+1;
            e++;
        }
        return count;

    }
    public static void main(String[] args) {
        int [] arr = {1,1,2,1,2,2,3,4};
        int goal = 2;// Atmost there should be 2 distinct elements in subArray

        int subArray = countAtmost(arr, goal) - countAtmost(arr, goal - 1);
        System.out.println(subArray);

        
    }
}
