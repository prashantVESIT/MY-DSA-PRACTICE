public class p16 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                int a = j;
                int b = ('A' - 1);
                int sum = a + b;
                char finalsum = (char) sum;
                System.out.print(" " + finalsum + " ");
            }
            for (int j = i - 1; j >= 1; j--) {
                int a1 = j;
                int b1 = ('A' - 1);
                int sum1 = a1 + b1;
                char finalsum1 = (char) sum1;
                System.out.print(" " + finalsum1 + " ");

            }
            System.out.println();
        }
    }

}
