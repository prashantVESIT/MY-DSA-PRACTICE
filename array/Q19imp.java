import java.util.*;
// Sorting || Looping || Two pointer
public class Q19imp {
    public static void main(String[] args) {
        int [] arr ={1,8,4,2,9,7,6};
        int target = 24;

        Arrays.sort(arr);
        //{1,2,4,6,7,8,9}
        for(int i=0;i<arr.length-2;i++){
            int start = i+1;
            int end = arr.length -1;
            int sum = arr[i]+arr[start]+arr[end];
            while(end>start){
                if(sum<target){
                    start++;
                }
                else if(sum>target){
                    end--;
                }
                else{
                    System.out.println("("+arr[i]+","+arr[start]+","+arr[end]+")");
                    break;  
                    
                }
            }
        }
    }
}
// Time Complexity : O(n^2)
