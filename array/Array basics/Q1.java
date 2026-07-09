import java.util.*;
// Find first repeting element 

public class Q1 {
    public static void main(String[] args) {
        int [] arr = {1,2,4,3,2,1};
        Set<Integer> s1 = new HashSet<>();
        for(int i : arr){
            if(s1.contains(i)){
               System.out.println(true);
               return;
            }
            s1.add(i);
        }
    }
}
