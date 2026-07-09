public class Q23imp {
    //Dutch National Flag Algorithm--> take 3 pointer and work upon the array (not a detail defn)
    // Sort colors: you will be given 3 color red white black as the number assigned to them are 0 1 2 resp. sort the colors as red(0) white(1) black(2) or numbers in the ascending order without using array sort function
    static void swap(int [] arr,int x ,int y){
        int temp = arr[x];
        arr[x]=arr[y];
        arr[y] = temp;
    }
    public static void main(String[] args) {
        int [] arr = {2,0,2,1,1,2,0};
        int n = arr.length;
        int i =0;
        int k =0;
        int j = n-1;

        while(k<=j){
            if(arr[k]==0){
                swap(arr,i,k);
                i++;
                k++;
            }
            else if(arr[k]==2){
                swap(arr,j,k);
                j--;
            }
            else{
                k++;
            }
        }
        for(int a : arr){
            System.out.print(a+" ");

        }
        

        
    }
    
}
