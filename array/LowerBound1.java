public class LowerBound1 {
    public static void main(String[] args) {
        int [] arr = {10,20,30,30,30,40,50};
        int target =40;
        int s = 0;
        int e = arr.length-1;
        int mid = s+(e-s)/2;
        int ans =arr.length;

        while(s<=e){
            mid = s+(e-s)/2;
            if(arr[mid]>=target){
                ans = mid;
                e = mid-1;
            }
            else{
                s= mid+1;
            }
        }
        System.out.println("Lower Bound index : "+ans);
    }
}
