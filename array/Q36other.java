import java.util.*;
// Peak of mountain in an array
public class Q36other {
    public static void main(String[] args) {
        int [] arr = {0,1,4,5,6,3,2};
        int s= 0;
        int e = arr.length-1;
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]<arr[mid+1]){
                s = mid +1;

            }
            else{
                ans = mid;
                e=mid-1;
            }
        }
        System.out.println("Peak: "+arr[ans]+" found at index "+ans);
    }
}
