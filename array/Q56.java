// Maixmum element in every window of size k
public class Q56 {
    public static void main(String[] args) {
        int[] arr = { 17, 2, 3, 8, 31, 23, 9, 18, 6, 5, 21 };
        int k = 3;
        int n = arr.length;
        int s = 0;
        int e = k - 1;
        int maxi = Integer.MIN_VALUE;

        for (int i = s; i <= e; i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        System.out.print(maxi + " ");

        while (e < n - 1) {
            int outgoing = arr[s];
            s++;
            e++;
            int incoming = arr[e];

            if (incoming > maxi) {
                maxi = incoming;
            }
            if (outgoing == maxi) {
                maxi = Integer.MIN_VALUE;
                for (int i = s; i <= e; i++) {
                    maxi = Math.max(maxi, arr[i]);
                }
            }

            System.out.print(maxi + " ");

        }

    }
}
