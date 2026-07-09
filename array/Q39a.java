import java.util.Scanner;
// UPDATED OPTIMIZED CODE FOR ALL CASES
public class Q39a {
     public int findSqRoot(int sqRoot){
        int n = sqRoot;
        int s = 1;
        int e = n;
        int ans = -1;
        if(sqRoot==0)// here if sqroot of 0 is asked then we handled the case here
        // Or it would return exception of dividing by 0
        {
            return 0;
        }
        while(s<=e){
            int mid = s + (e-s)/2;
            if(mid>n/mid) // mid * mid -> integer overFlow 
            {
                e = mid-1;
            }
            else{
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sqRoot = sc.nextInt();
        Q39a sr = new Q39a();
        int ans = sr.findSqRoot(sqRoot);
        System.out.println(ans);
        
        
    }
}
