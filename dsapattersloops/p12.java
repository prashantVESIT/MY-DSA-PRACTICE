public class p12 {
    public static void main(String[] args) {
        for(int i =1;i<=5;i++){
            for(int j =1;j<=i;j++){
                int a = j;
                int b = ('E'+1);
                int sub = b-a;
                char finalsub= (char)sub;
                System.out.print(finalsub+ " ");
            }
            System.out.println();
        }
    }
    
}
