public class Q15 {
    //Two sum
    public static void main(String[] args) {
        int [] arr = {2,5,7,3,9,1};
        int t = 14;

        for(int i=0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int start =0;
        int end =arr.length -1;
        while(end>start){
            int x = arr[start]+arr[end];
            if(x>t){
                end--;
            }
            else if(x<t){
                start++;
            }
            else{
                System.out.println("("+arr[start]+","+arr[end]+")");
                break;
            }
        }
    }
    
}
