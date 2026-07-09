import java.util.*;
// Two sum
public class Q2 {
    public static void main(String[] args) {
        int [] arr = {2,7,9,11};
        int target = 18;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                System.out.println(map.get(complement)+","+i);
                return;
            }
            else{
                map.put(arr[i],i);
            }

        }
    }
}
