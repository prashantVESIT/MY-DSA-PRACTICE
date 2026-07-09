import java.util.*;

//BINARY SEARCH ON ANSWER PATTERN
// finding Square Root of the number if it is the perfect square
// if it is not perfect square then return the lowest nearest square root 

public class Q39 {
    public int findSqRoot(int sqRoot){
        int n = sqRoot;
        int s = 0;
        int e = n;
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(mid*mid>n){
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
        Q39 sr = new Q39();
        int ans = sr.findSqRoot(sqRoot);
        System.out.println(ans);
        
    }
}
