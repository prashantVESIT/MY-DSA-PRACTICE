import java.util.*;
// Count distanct elements in every window of size k 
public class Q55 {
    public static void main(String[] args) {
        Map<Integer,Integer> m = new HashMap<>();
        int [] arr = {1,2,2,2,3,3,2,1,1,4,5,1,2};
        int k = 5;
        int n = arr.length;
        int s = 0;
        int e = k-1;

        for(int i = s;i<=e;i++){
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }
        System.out.print(m.size()+" ");

        while(e<n-1){
            if(m.get(arr[s])>1){
                m.put(arr[s],m.get(arr[s])-1);
            }
            else{
                m.remove(arr[s]);
            }

            s++;
            e++;

            m.put(arr[e],m.getOrDefault(arr[e],0)+1);

            System.out.print(m.size()+" ");

            

        }

    }
}
