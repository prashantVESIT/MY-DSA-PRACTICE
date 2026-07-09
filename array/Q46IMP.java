/* 
KOKO EATING BANANA

koko loves to eat banana there are arr[] of piles of banana each pile she can eat bananas at the speed of k bananas per hour
your goal is to find the minimum integer k such that she can finish all the bananas within h hour

Division method : 
eg. 8/3 =2.66666
a/b --> on floor division (rounds down) ANS : 2
(a+b-1)/b --> ceiling division (rounds up) ANS : 3

*/
public class Q46IMP {
    static boolean isValidAnswer(int []arr,int h ,int minSpeed){
        int n = arr.length;
        long sum = 0;
        for(int i = 0;i<n;i++){
            sum+=((arr[i]+minSpeed-1)/minSpeed);
        }
        if(sum<=h){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 3, 8, 7, 11 };
        int n = arr.length;
        int h = 8;
        int maxi = 0;
        for(int i : arr){
            if(maxi<i){
                maxi = i;
            }

        }
        int s = 1;
        int e = maxi;
        int ans = -1;
        while(e>=s){
            int mid = s + (e-s)/2;
            if(isValidAnswer(arr,h,mid)){
                ans = mid;
                e = mid -1;
            }else{
                s = mid +1;
                
            }
        }
        System.out.println(ans);

    }
}
