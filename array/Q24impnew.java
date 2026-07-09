import java.util.*;
//***********************************************
//Missing Elements From An Array With Duplicates
//Given an array of length n having 1-n integers return list of integers that are missing from an array

public class Q24impnew {
    public static void main(String[] args) {
        
        int [] arr = {8,2,2,9,4,6,4,5,6,10};
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<n;i++){
            int value = Math.abs(arr[i]);
            int position = value-1;

            if(arr[position]>0){
                arr[position]=-arr[position];
            }
        }
        for(int i = 0;i<n;i++){
            if(arr[i]>0){
                list.add(i+1);
            }
        }
        System.out.println(list);
    }
}
