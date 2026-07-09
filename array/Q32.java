public class Q32 {
    // Rotate matrix by 90
    // longer method with more memory
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int n = arr.length;
        int m = arr[0].length;
        int [][] tarr = new int[n][m];
        int [][] rarr = new int[n][m];

        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                tarr[i][j]=arr[j][i];
            }
        }
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                rarr[i][m-1-j]=tarr[i][j];
            }
        }
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println();

        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                System.out.print(rarr[i][j]+" ");

            }
            System.out.println();
        }
    }
}
