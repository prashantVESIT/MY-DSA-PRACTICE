public class Q7 {
    public static void main(String[] args) {
        // Print alternate Extreme element of an Array
        // 1st largest --> 1st smallest-->2nd largest-->2nd smallest...
        int[] arr = { 4, 7, 2, 3, 1, 8, 9, 5, 6 };

        // Sorting An array
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int start = 0;
        int end = arr.length - 1;
        while (end >= start) {
            if (start == end) {
                System.out.println(arr[start] + " ");
            } else {
                System.out.println(arr[end]);
                System.out.println(arr[start]);
            }

            start++;
            end--;
        }

    }

}
// Time Complexity : O(n^2) (nested loop)
// Space Complexity : O(1)
