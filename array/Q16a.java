public class Q16a {
    public static void main(String[] args) {
        int n= 6;
        int [] arr = {0,1,2,4,5,6};

        int sum1=0;
        for(int i: arr){
            sum1 += i;
        }
        int sum2=0;
        for(int i =0;i<=n;i++){
            sum2 +=i;

        }

        System.out.println("missing element:"+(sum2-sum1));


        
    }
}
