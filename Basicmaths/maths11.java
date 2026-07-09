//Print all print number from 1 to n 
import java.util.*;
public class maths11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        
        for(int i =1;i<=n;i++){
            int count =0;
            for(int j =1;j<=i;j++){
                int num = i%j;
                if(num==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(i+" ");
            }
        }
    }
}
