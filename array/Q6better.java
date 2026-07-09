public class Q6better {
    public static void main(String[] args) {
     int [] arr1 = {1,2,3,4,5,6};
        int [] arr2 = {2,4,6};
        int x =0;
        int y = 0;
        while(x<arr1.length && y<arr2.length){
            if(arr1[x]==arr2[y]){
                System.out.print(arr2[y]+" ");
                y++;

            }else{
                x++;
            }
        }   
    }
}
