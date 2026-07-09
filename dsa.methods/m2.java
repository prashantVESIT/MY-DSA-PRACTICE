public class m2 {

    int solve(int num){
            System.out.println(num);
            num = num*10;
            System.out.println(num);

            return num;

        }
    public static void main(String[] args) {
        int num =5;
        m2 a = new m2();
        a.solve(5);
        System.out.println(num);
    }
    
}
