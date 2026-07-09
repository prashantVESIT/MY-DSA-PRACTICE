//Armstrong number :
// a number is called armstrong number when sum of its digit each raise to the power of number of digits
import java.util.*;

public class maths9 {
    int digits(int a) {
        int count = 0;
        while (a > 0) {
            count++;
            a = a / 10;

        }
        return count;
    }

    double armstrongnumber(int a) {
        double sum = 0;
        double d = digits(a);
        while (a > 0) {
            double num = a % 10;
            a = a / 10;
            sum += Math.pow(num, d);

        }

        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = sc.nextInt();
        maths9 m1 = new maths9();
        double n = m1.armstrongnumber(a);
        if (a == n) {
            System.out.println("It is a Armstrong number");
        } 
        else {
            System.out.println("It is not a Armstrong number");
        }
    }

}
