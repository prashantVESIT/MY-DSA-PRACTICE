import java.util.*;

public class practice1 {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 } };
        int sRow = 0;
        int sCol = 0;
        int eRow = arr.length - 1;
        int eCol = arr[0].length - 1;

        while (sRow <= eRow && sCol <= eCol) {
            for (int i = sCol; i <= eCol; i++) {
                System.out.print(arr[sRow][i] + " ");
            }
            sRow++;
            System.out.println();

            for (int i = sRow; i <= eRow; i++) {
                System.out.print(arr[i][eCol] + " ");
            }
            eCol--;
            System.out.println();
            for (int i = eCol; i >= sCol; i--) {
                System.out.print(arr[eRow][i] + " ");
            }
            eRow--;
            System.out.println();
            for (int i = eRow; i >= sRow; i--) {
                System.out.print(arr[i][sCol] + " ");
            }
            sCol++;
            System.out.println();
        }

    }

}
