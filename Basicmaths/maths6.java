//GCD of two numbers 
public class maths6{
    public static void main (String[]args){
        int a = 20;
        int b =45;
        while(b>0){
            int temp = b;
            b = a%b;
            a=temp;
            
            
        }
        int GCD = a;
        System.out.println("GCD is: "+GCD);
    }
}