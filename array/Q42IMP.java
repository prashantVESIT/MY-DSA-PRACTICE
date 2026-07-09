// BOOK ALLOCATION PROBLEM 
public class Q42IMP {
    static boolean isValidAnswer(int[] arr, int k, int maxPages) {
        int n = arr.length;
        int studentCount = 1;
        int pages = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] + pages <= maxPages) {
                pages += arr[i];
            } else {
                studentCount++;
                if (studentCount > k || arr[i] > maxPages) {
                    return false;
                } else {
                    pages = 0;
                    pages += arr[i];
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 10,40,30,20,5 };
        int n = arr.length;
        int k = 2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int s = 1;
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
