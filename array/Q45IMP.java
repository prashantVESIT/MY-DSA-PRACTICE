import java.util.*;
//EKO SPOUJ PROBLEM
// You are given an array trees[] of n positive integers, where trees[i] represents the height of the i-th tree 
// you have given a wood cutting machine that can be set to a height H 
// the machine cuts only the part of a tree that is above height H 
// you need to collect at least M units of wood

// find the maximum possible value of H such that the total amount of wood collected is at least M
public class Q45IMP {
    static boolean isValidAnswer(int [] arr,int minWoods,int maxHeight){
        int n = arr.length;
        int sum = 0;
        for(int i =0;i<n;i++){
            if(arr[i]>=maxHeight){
                sum+=arr[i] - maxHeight;
            }
        }
        if(sum>=minWoods){
            return true;
        }else{
            return false;

        }
        
    }
    public static void main(String[] args) {
        int [] arr = { 20,15,17,9};
        int k = 7;
        int s = 0;
        int maxi=-1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>maxi){
                maxi = arr[i];
            }

        }
        int e = maxi;
        int ans = -1;
        while(e>=s){
            int mid = s+(e-s)/2;
            if(isValidAnswer(arr,k,mid)){
                ans = mid;
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
