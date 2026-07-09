// Largest Subarray with sum K
// Sliding window pattern : variable window size 
public class Q59 {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 1, 1, 2, 3, 5 };
        int k = 5;
        int n = arr.length;
        int s = 0;
        int e = 0;
        int sum = 0;
        int size = 0;

        while (e < n) {
            sum += arr[e];

            while (sum > k) {
                sum -= arr[s];
                s++;
            }

            if (sum == k) {
                size = Math.max(size, e - s + 1);
            }

            e++;

        }
        System.out.println(size);

    }

}
