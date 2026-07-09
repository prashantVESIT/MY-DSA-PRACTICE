import java.util.*;
// return the number which is most repeated int the array
public class Q3 {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,2,2,2,3,3,2,1};
        int n =arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
           int freq = map.getOrDefault(arr[i], 0)+1;
           if(freq>n/2){
            System.out.println(arr[i]);
            return;
           }
           map.put(arr[i],freq);

        }
    }
}
