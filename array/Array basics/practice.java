import java.util.*;
public class practice {
    public static void main(String[] args) {
        int[] arr = { 1, 0, -1, 0, -2, 2 };
        int target = 0;
        Arrays.sort(arr);
        int n = arr.length;

        for(int i = 0;i<n-3;i++){
            for(int j = i+1;j<n-2;j++){
                int k = j+1;
                int l = n-1;
                while(k<l){
                    int sum = arr[i]+arr[j]+arr[k]+arr[l];
                    if(sum==target){
                        System.out.println("("+arr[i]+","+arr[j]+","+arr[k]+","+arr[l]+")");
                        k++;
                        l--;
                    }
                    else if(sum<target){
                        k++;

                    }
                    else{
                        l--;
                    }
                    }
                }

            }
        }
    }

