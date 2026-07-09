//Sum of digits of number 
public class maths2 {
    public static void main(String[] args) {
        int num = 54231;
        int sum =0;
        while(num>0){
            sum = sum + num %10;
            num = num/10;
        }
        System.out.println("Sum of all digits: "+sum);
    }
    
}
