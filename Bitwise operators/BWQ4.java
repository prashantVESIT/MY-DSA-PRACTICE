public class BWQ4 {
    public static void main(String[] args) {
        // converts decimal to binary 
        int n = 13;
        String r ="";
        while(n>0){
           r = n%2 + r ; 
           n = n>>1;

        }

        System.out.print(r);
    }
    
}
