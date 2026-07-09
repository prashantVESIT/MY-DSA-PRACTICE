public class BW1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);

        int n =1;
        for(int i =1;i<=32;i++){
            n=n<<1;
            System.out.println(n);
        }
        int n1 = 100;
        for(int i = 1;i<=10;i++){
            n1 = n1>>1;
            System.out.println(n1);
        }

        //>>> operator shifts the bit to the right and add 0's to the left irrespective of the sign of the number 
        // it is similar to right shift but it just adds 0 to the left 
        int n2 = -1212;
        n2=n2>>>2;
        System.out.println(n2);
    }
    
}
