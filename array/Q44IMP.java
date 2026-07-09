import java.util.*;
// Agressive Cows Problem
public class Q44IMP {
    static boolean isValidAnswer(int [] arr , int cows,int minDist){
        //ek cow ko set kr lo 
        int cowCount = 1;
        //uski position bhi 
        int position = 0;
        for(int i =0;i<arr.length;i++){
            // current postion check kro ki next cow kaha par baith skti h 
            // uske aur initial cow ke position ka diff
            //>= minDist hua tho cow ko baitha do
            if((arr[i]-arr[position])>=minDist){
                // ye true hua tho ek aur cow ko place krdo
                cowCount++;
                // ab previous wali position ko update kr do kyu ki
                // ab new cow se ditance calculate hogi 
                position = i;
                // jaise hi saari cows baith jaiye iska mtlb ye valid solution h 
                if(cowCount == cows){
                    return true;
                }

            }
        }
        return false;
        
    }
    public static void main(String[] args) {
        int[] arr = { 9, 2, 4, 1, 8 };
        int n = arr.length;
        int k = 3;
        Arrays.sort(arr);
        int s = 1;
        int e = arr[n-1]-arr[0];
        int ans = -1 ;

        while(s<=e){
            int mid = s+(e-s)/2;
            if(isValidAnswer(arr,k,mid)){
                ans = mid;
                s = mid + 1;

            }else{
                e = mid -1;
                
            }
        }
        // Minimum diatnce between two cows that should be maximum among all the distances
        System.out.println(ans);



    }
}
