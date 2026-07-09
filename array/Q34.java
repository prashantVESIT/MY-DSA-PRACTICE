public class Q34 {
// Calculating Upper and Lower Bound index of an Array
    public int calLB(int [] arr,int target){
        int n = arr.length;
        int s =0;
        int e = n-1;
        int mid = s+(e-s)/2;
        int ans = mid;
        while(s<=e){
            mid = s+(e-s)/2;
            if(arr[mid]>=target){
                ans = mid;
                e = mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;

    }

    public int calUB(int [] arr,int target){
        int n = arr.length;
        int s =0;
        int e = n-1;
        int mid = s+(e-s)/2;
        int ans = mid;
        while(s<=e){
            mid = s+(e-s)/2;
            if(arr[mid]>target){
                ans = mid;
                e = mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr = { 10, 20, 20, 30, 30, 30, 40, 40, 50 };
        int target = 30;
        Q34 s1 = new Q34();
        int LowerBound=s1.calLB(arr,target);
        int UpperBound = s1.calUB(arr,target);
        System.out.println("LowerBound: "+LowerBound);
        System.out.println("UpperBound: "+UpperBound);
        
    }
}
