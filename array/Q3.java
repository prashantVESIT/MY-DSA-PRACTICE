public class Q3 {
    // Addition of positive and negative number of an array 
    public static void main(String[] args) {
        int [] arr = {-1,2,-3,4,-5,6};
        int posAdd=0;
        int negAdd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                posAdd += arr[i];

            }
            else{
                negAdd += arr[i];
            }
        }
        System.out.println("Sum of positive number : "+ posAdd);
        System.out.println("Sum of negative number : "+ negAdd);
    }

    // Time Complexity = O(n)
    // Space Complexity = O(1)
}
