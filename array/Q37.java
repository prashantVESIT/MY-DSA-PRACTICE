/*You are given an array that has been rotated at some pivot unknown to you beforehand. The array was initially sorted in increasing order, and then rotated at the pivot. Your task is to find the pivot index, which is the index of the highest element in the array(ie., the last element of the unrotated sorted array).
A rotated sorted array means that you take a portion of a sorted array from some index k to the end, and move it to the front. For example, the sorted array [0,1,2,4,5,6,7] after being rotated at pivotindex 3 .becomes [4,5,6,7,0,1,2]
*/
public class Q37 {

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2, 3 };
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;

        // L1: 4,5,6,7
        // L2: 0,1,2,3
        // we are comparing mid value with the last element of an rotated sorted array 
        // if mid is greater then last ; then e = mid-1;
        // if mid is less then end ; then s = mid +1;

        if(arr[s]<arr[e]){
            // If the array is not rotated 
                System.out.println(-1);
            }

        while (e >= s) {
            
            int mid = s + (e - s) / 2;
            if (arr[mid] <= arr[n - 1]) {
                e = mid - 1;
            }
            if (arr[mid] > arr[n - 1]) {
                // we dont know weather the soln is final soln or not 
                // so we store it as a potential soln and we updated the start pointer 
                ans = mid;
                s = mid + 1;
            }
        }
        System.out.println("Pivot index: "+ans);

    }
}
