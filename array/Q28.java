import java.util.*;

public class Q28 {
    // ROW sum of elements 
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9,10}};
        int sum =0;
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                sum += arr[i][j]; 
            }
            list.add(sum);
            sum=0;
        }
        System.out.println(list);
    }
}
