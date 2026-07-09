/*
You are given an array boards where boards irepresents the length of the i-thboard. There are
painters available, and each painter takes 1 unit of time to paint 1 unit length of a board.
Each painter can only paint a contiguous sequence of boards, and each board must be painted
entirely by a single painter (boards cannot be split).
Your task is to assign the boards to the painters such that the maximum time taken by any painter
is minimized.
*/
public class Q43IMP {
    static boolean isValidAnswer(int[] arr, int k, int maxTime) {
        int n = arr.length;
        int painter = 1;
        int time = 0;
        for (int i = 0; i < n; i++) {
            if (time + arr[i] <= maxTime) {
                time += arr[i];
            }
            else{
                painter++;
                if(painter>k || arr[i]>maxTime){
                    return false;
                }
                else{
                    time = 0;
                    time+=arr[i];
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 10, 40, 20, 30 };
        int n = arr.length;
        int k = 2;
        int s = 0;
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        int e = sum;
        int ans = -1;

        while (e >= s) {
            int mid = s + (e - s) / 2;
            if (isValidAnswer(arr, k, mid)) {
                ans = mid;
                e = mid - 1;

            } else {
                s = mid + 1;
            }
        }
        System.out.println(ans);

    }
}
