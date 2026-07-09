public class p11 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j =1;j<=i;j++){
                int a = j;
                int b = ('A'-1);
                int sum = a + b;
                char finalsum = (char)sum;
                System.out.print(finalsum + " ");

            }
            System.out.println();
        }
    }
    
}
