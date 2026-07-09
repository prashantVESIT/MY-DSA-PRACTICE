import java.util.*;
// Problem Number: 525

// Problem Statement (summary):

// Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0s and 1s.
public class Q69 {
    public static void main(String[] args) {
        int [] arr = {1,0,1,1,0,1,0,1,0,0,0};
        int n = arr.length;
        int k =0;
        for(int i =0;i<n;i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
        }
        Map<Integer,Integer> m = new HashMap<>();
        m.put(0,-1);
        int sum = 0;
        int maxLen =0;

        for(int i =0;i<n;i++){
            sum+=arr[i];
            int target = sum - k;

            if(m.containsKey(target)){
                maxLen = Math.max(maxLen,i-m.get(target));
            }
            m.put(sum,i);
        }
        System.out.println(maxLen);
    }
}
