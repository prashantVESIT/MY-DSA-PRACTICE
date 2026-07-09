import java.util.*;
public class BWQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //CHECK EVEN OR ODD
        int n = 5;
        // instead of modulo operator we will be using BITWISE AND operator
        //Modulo operations are found to be heavy as compared to Bitwise operation
        if((n&1)==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }

        
        // CHECK POWER OF 2 M1
        
        int a = 5;
        int count = 0;
        while(a>0){
            if((a & 1) != 0){
                count++;
            }
            a = a>>1;
        }
        if(count == 1){
            System.out.println("It is power of 2");
        }
        else{
            System.out.println("It is not a power of 2");
        }

        // CHECK POWER OF 2 M2

        int b = 16;
        if(((b) & (b-1))==0){
            System.out.println("It is power of 2");
        }
        else{
            System.out.println("It is not a power of 2");
        }

        // SWAP TWO NUMBERS USING XOR

        int x = 5;
        int y = 6;
        System.out.println("X : "+ x);
        System.out.println("Y : "+ y);
        x = (x ^ y);
        y = (x ^ y);
        x = (x ^ y);
        System.out.println("X : "+ x);
        System.out.println("Y : "+ y);

        //Unique element in between numbers 

        int m = 5;
        int o =10;
        int t = 12;
        int p = 5;
        int q = 10;
        int h = m^t^o^p^q;
        System.out.println("Unique element : "+h);

        //Unique element in an Array

        int [] arr = {12,10,5,7,5,12,10};
        int result = 0;
        for(int r: arr){
            result ^=r;
        }
        System.out.println(result);

        //Remove last set bit 
        System.out.println((n)&(n-1));

        //Get last set bit 
        System.out.println((n)&(-(n)));


    }
    
}
