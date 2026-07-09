// Count Negative Numbers in Every Window of Size K

// Problem Description
// Given an integer array arr of size N and an integer K, find the number of negative elements present in every contiguous subarray (window) of size K.

// Return or print the count for each window.



public class Q58 {
    public static void main(String[] args) {
        int [] arr = {-1,2,-3,4,-5,-2,9,10,-4};

        int k = 3;
        int n = arr.length;
        int s = 0;
        int e = k-1;
        int negNum = 0;

        for(int i =s;i<=e;i++){
            if(arr[i]<0){
                negNum++;
            }
        }
        System.out.print(negNum);

        while(e<n-1){
            int outgoing = arr[s];
            s++;
            e++;
            int incoming = arr[e];

            if(outgoing <0){
                negNum--;
            }
            if(incoming<0){
                negNum++;
            }

            System.out.println(negNum);

        }

        
        
    }
}
