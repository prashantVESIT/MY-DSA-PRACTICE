public class Q16 {
    // Find missing element in an array
    public static void main(String[] args) {
        
        int [] arr ={0,1,2,3,5,6};
        int n =arr[arr.length-1];


        int result1 = 0;
        for(int i : arr){
            result1 ^=i;
        }
        int result2 =0;
        for(int i =0;i<=n;i++){
            result2 ^=i;
        }
        int result3 = result1 ^ result2;

        System.out.println("Missing number: "+ result3);


        

    }

    
}
