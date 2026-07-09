//LCM of two numbers 
// LCM * GCD = a * b
public class maths7 {
    public static void main(String[] args) {

        int a = 15;
        int b = 45;

        while (b > 0) {
            int temp = b;
            b= a%b;
            a = temp;

        }
        int GCD = a;
        System.out.println("GCD of numbers:"+GCD);
        int x = 15;
        int y =45;
        int LCM = (x*y)/GCD;
        System.out.println("LCM of number:"+LCM);
    }

}
