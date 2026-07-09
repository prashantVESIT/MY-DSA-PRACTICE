public class m1 {

    static void  table(int n) // Method signature
    {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }

    int sum(int a,int b){
        int add=a+b;
        return add;
    }

    
    

    public static void main(String[] args) {

       table(3);
      

       m1 s = new m1();
       int add=s.sum(2,3);
       System.out.println(add);
    }

}
