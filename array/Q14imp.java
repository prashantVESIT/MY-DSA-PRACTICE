public class Q14imp {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 0 };
        int i = 0;
        int j = arr.length - 1;

        while (j > i) {
            if (arr[i] == 0) {
                i++;
            } 
            else if (arr[j] == 1) {
                j--;
            } 
            else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;

            }

        }
        for (int a : arr) {
            System.out.print(a + " ");

        }
    }

}
