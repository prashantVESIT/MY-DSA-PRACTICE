import java.util.*;
public class a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[5];
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        int max =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int min =arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Maximum element:"+max);
        System.out.println("Minimun element:"+min);

        
    }
    
}
