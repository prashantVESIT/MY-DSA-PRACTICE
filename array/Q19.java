public class Q19 {
    //Three Sum : Find a triplet of numbers in an array such that their sum = target
    public static void main(String[] args) {
        int [] arr ={1,2,4,5,6,9,3};
        int target = 13;

        int n =arr.length;
        for(int i =0;i<n-2;i++){
            for(int j = i+1;j<n-1;j++){
                for(int k = j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        System.out.println("("+arr[i]+","+arr[j]+","+arr[k]+")");
                    }
                }
            }
        }
        
    }
}
// Time Complexity : O(n^3)

