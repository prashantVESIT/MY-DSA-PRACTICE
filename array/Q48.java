// In a nearly sorted array, elements are expected to be in sorted order except that each element can be swapped with its adjacent elements. This means that any element at index : in a sorted array could appear at index 1-1. i.or i+1 in a nearly sorted array. Your task is to determine the index of a given target element K within this array. If the element K is not present, return-1.

public class Q48 {
    // Search in nearly sorted arr
    public static void main(String[] args) {
        int [] arr = {10,30,20,50,40,60,80,70};
        int n = arr.length;
        int k = 70;

        int s = 0;
        int e = n-1;
        while(e>=s){
            int mid = s + (e-s)/2;
            if(mid-1>=0 && arr[mid-1]==k){
                System.out.println(mid - 1);
                return;
            }
            if(arr[mid]==k){
                System.out.println(mid);
                return;
            }
            if(mid+1<n && arr[mid+1]==k){
                System.out.println(mid + 1);
                return;
            }
            
            if(k>arr[mid]){
                s = mid+1;
            }else{
                e = mid -1;
            }

        }
    }
}
