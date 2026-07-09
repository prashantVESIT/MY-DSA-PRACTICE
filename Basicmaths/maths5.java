//check prime number
import java.util.*;
public class maths5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        for(int i =1;i<=n;i++){
            int fact=n%i;
            if(fact==0){
                 count++;
            }
            


        }
        if (count ==2){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
    
}
