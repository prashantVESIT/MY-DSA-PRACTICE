// Swap alternate elements of an array 
public class Q5 {
    public int[] swap(int [] arr){
        for(int i =0;i<arr.length-1;i+=2){
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        Q5 q1 = new Q5();
        int [] arr = {1,2,3,4,5};
        int [] ans = q1.swap(arr);
        System.out.println("Swaped Alternate elements :");
        for(int i : ans){
            System.out.print(i +" n");
        }
    }
    
}
