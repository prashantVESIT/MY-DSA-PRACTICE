public class Q22vimp {
    public static void main(String[] args) {
        int[] arr = { 6, 1, 2, 8, 5, 6, 10, 1 };

        int sum =0;
        int n = arr.length;
        for(int i : arr){
            sum += i;
        }
        
        int leftSum = 0;
        int rightSum = sum;
        for(int i=0;i<n;i++){
            
            rightSum -= arr[i] ;


            if(leftSum == rightSum){
                System.out.println(i);
                return;
            }

            leftSum+= arr[i];
        }
        
    }
}
