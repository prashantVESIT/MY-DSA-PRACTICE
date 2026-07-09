public class Q53 {
    // Maximum sum of subarray of size k
    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 8, 2, 9, 1 };
        int k = 3;
        if (k > arr.length || k <= 0) {
            System.out.println("Invalid window size");
            return;
        }
        int l = 0;
        int r = k - 1;
        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum += arr[i];
        }
        int max = sum;
        while (r < arr.length - 1) {
            sum = sum - arr[l] + arr[r + 1];
            max = Math.max(sum, max);
            l++;
            r++;
        }
        System.out.println(max);

    }
}
