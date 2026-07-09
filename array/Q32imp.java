public class Q32imp {
    // Rotate matrix by 90
    // step1: transpose the same matrix 
    // step2: reversing each row 
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int n = arr.length;
        int m = arr[0].length;
        for(int i =0;i<n;i++){
            for(int j =i+1;j<m;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j =0;j<m/2;j++){
                int temp =arr[i][j];
                arr[i][j]=arr[i][m-1-j];
                arr[i][m-1-j]=temp;
            }
        }

        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
            
    }
}
