// Find the row with maximum number of 1's
public class Q51 {
    public static void main(String[] args) {
        int[][] arr = 
              { { 0, 0, 0, 1, 1, 1 },
                { 0, 0, 0, 0, 0, 1 },
                { 0, 0, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 1, 1 },
                { 0, 0, 0, 0, 0, 0 } };
        int n = arr.length;
        int m = arr[0].length;
        int rowNum=-1;

        int r = 0;
        int c = m-1;

        while(r<n && c>=0 ){
            if(arr[r][c]==1){
                rowNum = r;
                c--;
            }
            else{
                r++;
            }
        }
        System.out.println(rowNum);

    }
}
