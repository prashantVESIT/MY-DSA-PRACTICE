public class Q49 {
    // Search in sorted array if the first element of the next row is greater then last element of previous row
    public static void main(String[] args) {
        int [][] arr = 
        {{1 ,2 ,3 ,4 },
         {10,11,12,13},
         {19,20,21,22}};
        int t = 20;
        int tRow = arr.length;
        int tCol = arr[0].length;
        int n = tRow * tCol;

        int s =0;
        int e = n-1;

        while(s<=e){
            int mid = s + (e-s)/2;
            int cRow = mid/tCol;
            int cCol = mid % tCol;

            if(arr[cRow][cCol]<t){
                s = mid + 1;
            }
            else if (arr[cRow][cCol]>t){
                e = mid - 1;
            }
            else{
                System.out.println(cRow +","+ cCol);
                break;
            }
        }
        
    }
}
