import java.util.*;
// LONGEST CONSECUTIVE SEQUENCE
// return the length of the longest sequence of consecutive integer
public class Q70 {
    public static void main(String[] args) {
        int[] arr = { 4, 200, 100, 10, 1, 5, 2, 3, 9 };
        int n = arr.length;
        Set<Integer> s = new HashSet<>();
        for (int i : arr) {
            s.add(i);
        }
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            if (s.contains(num - 1)) {
                continue;
            }
            
            int current = num;
            int length =1;
            while (s.contains(current + 1)) {
                length++;
                current++;
            }
            maxLen = Math.max(length,maxLen);
        }
        
        System.out.println(maxLen);
    }

}
