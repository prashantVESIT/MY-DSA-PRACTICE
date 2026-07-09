public class Q50 {
    // Search in sorted array where every row is sorted
    public static void main(String[] args) {
        int [][] arr = 
        {{1,  2,  5, 10},
         {4,  6,  7, 18},
         {8, 12, 17, 19},
         {9, 11, 14, 21}};

        int n = arr.length;
        int m = arr[0].length;
        int target = 17;
        int r = 0;
        int c = m-1;

        while(r<n && c>=0){
            if(arr[r][c]<target){
                r++;
            }
            else if (arr[r][c]>target){
                c--;
            }
            else{
                System.out.println(r+","+c);
                break;
            }
        }
    }
}
