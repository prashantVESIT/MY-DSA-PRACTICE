import java.util.*;
public class TwoSumbestApproach {
    public static void main(String[] args) {
        int [] arr= {1,-2,3,6,-4,-8};
        int target = -6;
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                System.out.println("Two numbers: "+"("+arr[i]+","+complement+")");
                System.out.println("Indices: "+"("+i+","+map.get(complement)+")");
                break;

            }
            map.put(arr[i],i);

        }
    }
    
}
