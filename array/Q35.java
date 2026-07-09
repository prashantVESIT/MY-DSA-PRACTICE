public class Q35 {
    // Calculating Upper and Lower Bound index of an Array
    // Also calculating frequency of a number
    public int calLB(int[] arr, int target) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int mid = s + (e - s) / 2;
        int ans = n;
        //IMP: if LB is not present in an array then ideally last place would be occupied by LB
        while (s <= e) {
            mid = s + (e - s) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;

    }

    public int calUB(int[] arr, int target) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int mid = s + (e - s) / 2;
        int ans = n;
        //IMP: if UB is not present in an array then ideally last place would be occupied by UB
        while (s <= e) {
            mid = s + (e - s) / 2;
            if (arr[mid] <= target) {
                s = mid + 1;
                
            } else {
                ans = mid;
                e = mid - 1;
                
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 20, 30, 30, 30, 40, 40 };
        int target = 40;
        Q35 s1 = new Q35();
        int LowerBound = s1.calLB(arr, target);
        int UpperBound = s1.calUB(arr, target);
        System.out.println("LowerBound: " + LowerBound);
        System.out.println("UpperBound: " + UpperBound);
        if (UpperBound == LowerBound) {
            System.out.println("Target not found in the array");
        }
        else {
            int freq = UpperBound - LowerBound;

            System.out.println("frequency of " + target + " is " + freq);
        }

    }
}
