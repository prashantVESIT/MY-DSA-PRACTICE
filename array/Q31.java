public class Q31 {
    // Transpose of a matrix
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 8, 9, 10 } };
        int[][] tarr = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                tarr[j][i] = arr[i][j];
            }
        }

        System.out.println("Original Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose Array: ");
        for (int i = 0; i < tarr.length; i++) {
            for (int j = 0; j < tarr[i].length; j++) {
                System.out.print(tarr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
