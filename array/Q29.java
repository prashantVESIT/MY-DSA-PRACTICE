import java.util.*;
// Column sum of elements
public class Q29 {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int n =arr.length;
        int m = arr[0].length;
        List<Integer> list = new ArrayList<>();
        int sum1=0;
        int sum2=0;
        int sum3=0;
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(j==0){
                    sum1 +=arr[i][j];
                }
                else if(j==1){
                    sum2 += arr[i][j];
                }
                else{
                    sum3 += arr[i][j];
                }
            }
           
        }
        list.add(sum1);
        list.add(sum2);
        list.add(sum3);
        System.out.println(list);
        
    }
}
