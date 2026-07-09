public class Q9 {
    public static void main(String[] args) {
        // Shift all elements of an array by 1 position to the right 
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int temp =arr[arr.length-1];
        int i = arr.length-1;
        while(i>0){
            arr[i]=arr[i-1];
            i--;
            
        }
        arr[0]=temp;
        for(int j : arr){
            System.out.print(j+" ");
        }
    }
    
}
