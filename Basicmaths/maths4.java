//Palindrome of a number
import java.util.*;
public class maths4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println("Actual number: "+ n);
        int number =n;
        int rev=0;
        while(n>0){
            rev = rev*10+n%10;
            n=n/10;
        }
        System.out.println("Reversed number: "+rev);
        if (number==rev){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
        
    }
}
