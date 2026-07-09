import java.util.*;
// Find maxSum of all the elements in the window provided all the elements should be diff 
public class Q57 {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 4, 2, 9, 9, 9 };
        Map<Integer, Integer> m = new HashMap<>();

        int n = arr.length;
        int k = 3;
        int s = 0;
        int e = k - 1;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = s; i <= e; i++) {
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);

            sum += arr[i];

            if (m.size() == k) {
                maxSum = sum;
            }
        }

        while (e < n - 1) {
            int outgoing = arr[s];
            s++;
            e++;
            int incoming = arr[e];

            //calculate sum
            sum = sum - outgoing + incoming;

            // Removing outgoing element
            if (m.get(outgoing) <= 1) {
                m.remove(outgoing);
            } else {
                m.put(outgoing, m.get(outgoing) - 1);
            }
            // Add new element and store its frequency
            m.put(arr[e], m.getOrDefault(arr[e], 0) + 1);
            // check map size if 3 
            if (m.size() == k) {
                // compare maxSum and sum 
                maxSum = Math.max(sum, maxSum);
            }

        }
        // Print Maxsum
        System.out.println(maxSum);
    }
}
