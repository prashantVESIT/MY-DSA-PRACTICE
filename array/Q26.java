public class Q26 {
    // MINIMUM SUBARRAY
    public static void main(String[] args) {
        int sum = 0;
        int minsum = Integer.MAX_VALUE;
        int[] arr = { -2, 1, -2, 3, 4 };
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum < minsum) {
                minsum = sum;
            }
            if(sum>0){
                sum=0;
            }
        }
        System.out.println(minsum);

    }
}
