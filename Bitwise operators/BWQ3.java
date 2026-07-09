public class BWQ3{
    public static void main(String[] args) {
        // powers of 4 
        
        int n = 64;
        if((n>0) && (((n) & (n-1))==0) && ((n & 0x55555555) != 0)){
           System.out.println("It is power of four");
        }
        else{
            System.out.println("It is not power of four");
        }
    }
}