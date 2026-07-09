public class Q4 {

    // Find first unsorted element in an array
    public static void main(String[] args) {
        int [] arr = {1,2,5,4,3};
        for( int i = 0;i < arr.length;i++){
            if(arr[i+1]<arr[i]){
                System.out.println(arr[i+1]+" is the first unsorted element in an array");
                break;
            }
        }
    }
}
