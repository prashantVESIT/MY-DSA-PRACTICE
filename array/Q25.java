public class Q25 {
    // Maximum subarray 
    // Given an integer array , find subarray with the largets sum and return its sum of elements 
    // KADANES ALGORITHM
    public static void main(String[] args) {
        int sum =0;
        int maxi = Integer.MIN_VALUE;
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        for(int i=0;i<arr.length-1;i++){
            //Step1: sum upadate krte h 
            sum +=arr[i];

            // Step2: maxi update krte h 
            if(sum>maxi){
                maxi = sum;
            }

            //Step 3: Sum check krte h for negative value 
            if(sum<0){
                sum = 0;

            }
        }
        System.out.println(maxi);
    }
}
