public class Q10 {
    // Print extreme elements of an array 
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int i = 0;
        int j= arr.length-1;
        while(j>i){
            System.out.print(arr[j]+" ");
            System.out.print(arr[i]+" ");

            i++;
            j--;
        }

    }
}
