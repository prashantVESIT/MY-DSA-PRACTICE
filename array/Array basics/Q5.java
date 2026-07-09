// MOVE ZERO'S
// You are given an array having zeros and all diff numbers your aim is to move zeros towards end n maintaining the relative order of the number like inc and dec 
public class Q5 {
    public static void main(String[] args) {
        int [] arr = {0,1,0,3};
        int i = 0;
        int j = i+1;
        while(j<arr.length){
            if(arr[i] != arr[j]){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }else{
                j++;

            }
        }
        for(int a : arr){
            System.out.print(a+" ");
        }
        
    }
    
}
