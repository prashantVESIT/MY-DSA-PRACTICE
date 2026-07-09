import java.util.*;
// Find first repeating elements in an array
public class Q21imp {
    public static void main(String[] args) {
        Integer [] arr ={1,2,4,3,5,4,2};
        HashMap<Integer,Integer> m1 = new HashMap<>();
        for(int i : arr){
            m1.put(i,m1.getOrDefault(i, 0)+1);
        }
        for(int i : arr){
            if(m1.get(i)>1){
                System.out.println(i);
                break;
            }
        }
        
    }
    
}
// Time Complexity : O(n)
// Space complexity : O(n)
