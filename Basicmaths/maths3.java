//Reverse a number
public class maths3 {
    public static void main(String[] args) {
        int num = 534241;
        System.out.println("Actual number:"+num);
        int rev=0;
        while(num>0){
            rev = rev*10+num%10;
            num = num/10;
        }
        System.out.println("Reversed number:"+rev);
    }
}
