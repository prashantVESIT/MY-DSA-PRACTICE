public class Q38 {
    // We have to find a target element in a rotated sorted array
    // we found out whether pivot index exist or not
    // if not exist then array is sorted ; then we applied simple binary search on
    // sorted array
    // if exist then we broke down an array at the point where pivot index is
    // we applied simple binary search on the two diff parts
    // if the target exist among one of the parts then it would return its index

    public int pivotIndex(int[] arr){ 
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;

        // we checked that if we have a sorted array or not
        // if sorted ->
        if (arr[s] < arr[e]) {
            return -1;
        }

        // if array is not sorted and its a rotated sorted array
        while (e >= s) {
            int mid = s + (e - s) / 2;
            if (arr[mid] <= arr[n - 1]) {
                e = mid - 1;
            } else {
                ans = mid;
                s = mid + 1;
            }

        }
        return ans;

    }

    // this function is applied when the array is sorted also when we made two diff
    // parts w.r.t pivot index

    public int binarySearch(int[] arr, int s, int e, int target) {

        while (e >= s) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }

    public int search(int[] arr, int target) {
        int n = arr.length;
        Q38 b = new Q38();
        int pivotIndex = b.pivotIndex(arr);

        // If the array is sorted
        if (pivotIndex == -1) {
            int ans = b.binarySearch(arr, 0, n - 1, target);
            return ans;

        }
        // If the array is rotated sorted array
        else {
            int startArray1 = 0;
            int endArray1 = pivotIndex;
            if (target >= arr[startArray1] && target <= arr[endArray1]) {
                int ans = b.binarySearch(arr, startArray1, endArray1, target);
                return ans;
            }
            int startArray2 = pivotIndex + 1;
            int endArray2 = n - 1;
            if (target >= arr[startArray2] && target <= arr[endArray2]) {
                int ans = b.binarySearch(arr, startArray2, endArray2, target);
                return ans;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 8, 0, 1, 2, 3 };
        int target = 7;
        Q38 a = new Q38();
        int ans = a.search(arr, target);
        System.out.println("Index of target: " + ans);

    }
}
