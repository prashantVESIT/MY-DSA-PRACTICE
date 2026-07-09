//Find Pivot Index 
// Pivot index :it is the index in an array where the sum of all the elements strictly to the right
// is equal to the sum of the elements stirctly to the left 
public class Q22 {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 8, 5, 6, 10, -1 };
        int add1 = 0;
        int j = 0;
        int[] sum1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            add1 += arr[i];
            sum1[j] = add1;
            j++;
        }

        add1 = 0;
        j = arr.length - 1;

        int[] sum2 = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            add1 += arr[i];
            sum2[j] = add1;
            j--;
        }

        int start = 0;
        int end = arr.length - 1;
        while (start <= end ) {
            if (sum1[start] == sum2[start]) {
                System.out.println("Pivot Index: " + start);
                break;

            }
            start++;
            
        }

    }
}
