// Perfect number :
//A perfect number is a number whose sum of proper divisors equals the number itself.
//Proper divisors do not include the number itself.
import java.util.*;
public class maths10 {
    int properdivisor(int a){
        int sum =0;
        for(int i=1;i<a;i++)// that's why while dividing we haven't include that number
            {
            int div=a%i;
            if(div==0){
                sum +=i;
            }

        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        maths10 m1 = new maths10();
        int p=m1.properdivisor(n);
        if(n==p){
            System.out.println("It is a perfect number");
        }
        else{
            System.out.println("It is not a perfect number");
        }
    }
 
}
