import java.util.*;
// Union of two Array
public class Q13 {
    public static void main(String[] args) {
        int []arr1 = {1,2,3,4,5,6};
        int [] arr2 = {3,5,7,8,9};
        int [] arr3 = arr1;
        
        
        ArrayList <Integer> a1 = new ArrayList<>();

        for(int i : arr3){
            a1.add(i);

        }

        for(int i:arr2){
            if(!a1.contains(i)){
                a1.add(i);
            }
        }
        Object [] arr4 = a1.toArray();

        for(Object i : arr4){
            System.out.print(i+" ");
        }
        
       

        
        
    }
    
}
