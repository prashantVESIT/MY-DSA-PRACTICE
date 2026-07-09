//print digits of the number 
public class maths1 {

    public static void main(String[] args) {
        int num = 12345;
        int count=0;
        while(num>0){
            int n = num%10;
            System.out.println("Digits:"+n);
            count++;
            num = num/10;
        }
        System.out.println("Number of digits: "+ count);
    }
}
