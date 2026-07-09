public class Q18 {
    //Two Sum : Find a pair of numbers in an array such that their sum = target
    public static void main(String[] args) {
        int [] arr= {1,-2,3,-4,6,-8};
        int target = -6;

        int n = arr.length;
        for(int i =0;i<=n-1;i++){
            for(int j =i+1;j<n;j++)
                {
                if((arr[i]+arr[j])==target){
                    System.out.println("("+arr[i]+","+arr[j]+")");
                    break;
                }
            }

        }
    }
}
