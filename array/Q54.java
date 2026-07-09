import java.util.ArrayDeque;
import java.util.Deque;

// First negative integer in every window of size k 

public class Q54 {
    public static void main(String[] args) {
        int [] arr = {-1,-2,7,8,-15,23,19};
        int n = arr.length;
        int k = 3;
         
        Deque<Integer> q = new ArrayDeque<>();
        int l = 0;
        int r = k-1;
        
        for(int i = l;i<=r;i++){
            if(arr[i]<0){
                q.offer(i);
            }
        }
        if(q.isEmpty()){
                System.out.println(0);
            }
            else{
                System.out.println(arr[q.peekFirst()]);
            }
        while(r<n-1){

            if(!q.isEmpty() && q.peekFirst()==l){
                q.pollFirst();
            }

            l++;
            r++;

            if(arr[r]<0){
                q.offer(r);

            }

            

            if(q.isEmpty()){
                System.out.println(0);
            }
            else{
                System.out.println(arr[q.peekFirst()]);
            }
             

            

        }
    
        
        
    }

}
