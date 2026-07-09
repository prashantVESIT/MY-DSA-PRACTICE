public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {1,5,7,3,2,8};

        for(int i =0;i<arr.length-1;i++){//Rounds 0 to 4 ; total 5 rounds
            for(int j =0;j<arr.length-1-i;j++){//Comparision With neighbouring elements
                if((arr[j]>arr[j+1])){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
