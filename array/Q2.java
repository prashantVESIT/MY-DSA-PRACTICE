public class Q2 {
    public static void main(String[] args) {
        // Multiply each element of array 
        int [] arr = {1,5,4,3,2};
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i]*10;
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();

        //Search for element in an array{Liner search}
        int n = 40;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("Element found at index :"+i);
                break;
            }
        }

        // Max element in an array 
        int max =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element :"+ max);

    }
}
