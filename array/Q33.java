public class Q33 {
    // Spiral print of a matrix
    public static void main(String[] args) {
        int[][] arr = { {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16} };
        int n = arr.length;
        int m = arr[0].length;

        int startingRow = 0;
        int startingCol = 0;
        int endingRow = n - 1;
        int endingCol = m - 1;

        while (startingRow <= endingRow && startingCol <= endingCol) {
            // row wise L->R from startingCol to endingCol
            for(int i=startingCol;i<=endingCol;i++){
                System.out.print(arr[startingRow][i]+" ");
                
            }
            startingRow++;
            System.out.println();

            // col wisr T->B from startingRow to endingRow
            for(int i =startingRow;i<=endingRow;i++){
                System.out.print(arr[i][endingCol]+" ");
                
            }
            endingCol--;
            System.out.println();
            // row wise R->L from endingCol to startingCol
            for(int i =endingCol;i>=startingCol;i--){
                System.out.print(arr[endingRow][i]+" ");
                
            }
            endingRow--;
            System.out.println();
            // col wise B->T from endingRow to startingRow
            for(int i =endingRow;i>=startingRow;i--){
                System.out.print(arr[i][startingCol]+" ");
            }
            startingCol++;
            System.out.println();
        }
    }
}
