public class Q14{
    // Sort an array of 0's and 1's auch that all 0's comes before 1's
    public static void main(String[] args) {
        int [] arr = {0,1,0,1,0,1};
        for(int i=0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-1-i;j++){
                if(arr[j+1]==0){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i : arr){
            System.out.print(i);
        }
        
    }
}