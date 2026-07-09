public class Q41 {
    public int[] mergeArray(int [] arr1,int [] arr2){
        int arr[] = new int[arr1.length + arr2.length];
        int x =0;
        int y =0;
        int i =0;
        
            while((x<arr1.length && y<arr2.length)){
                if(arr1[x]<arr2[y]){
                    arr[i]=arr1[x];
                    x++;
                }
                else{
                    arr[i] = arr2[y];
                    y++;
                }
                i++;
            }

            while(x<arr1.length){
                arr[i]=arr1[x];
                i++;
                x++;
            }
            while(y<arr2.length){
                arr[i]=arr2[y];
                i++;
                y++;
            }

            
        return arr;

    }
    public static void main(String[] args) {
        int [] arr1 = {1,3,5,7,9,11};
        int [] arr2 = {2,4,6,8,10,12};
        Q41 s1 = new Q41();
        int [] arr = s1.mergeArray(arr1,arr2);
        for(int i:arr){
            System.out.print(i+" ");
        }
        
    }
}
