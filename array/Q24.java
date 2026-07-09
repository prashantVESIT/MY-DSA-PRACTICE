import java.util.*;
//Missing elements from an array of duplicates of size n
//you must return a list of integer
// you have to return from 1-n numbers 
public class Q24 {
    public static void main(String[] args) {
        int [] arr = {8,2,1,9,4,6,4,5,6,10};
        int n = arr.length;
         
        HashMap<Integer,Integer> freq = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            freq.put(i,freq.getOrDefault(i, 0)+1);
        }
        for(int i=1;i<=n;i++){
            if(!freq.containsKey(i)){
                list.add(i);
            }
            

        }
        System.out.println(list);
    }
    
}
