// Rotate an Array by k times
import java.util.*;
public class Q40 {
    public void reverse(int [] arr,int s,int e){
        while(e>=s){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int k = sc.nextInt();
        k=k%n;
        
        Q40 s1=new Q40();
        s1.reverse(arr,0,n-1);
        s1.reverse(arr,0,k-1);
        s1.reverse(arr,k,n-1);

        for(int i:arr){
            System.out.print(i+" ");
        }


        
        
    }
}
