import java.util.*;
public class BWQ1 {
    public static void main(String[] args) {
        // Find missing elements in an Array 
        int [] arr1 = {1,3,5,2};
        int result1 = 0;
        Arrays.sort(arr1);
        for(int i =0;i<arr1.length;i++){
            result1 ^=arr1[i];
        }

        int [] arr2 = {1,2,3,4,5};
        int result2 =0;
        for(int i =0;i<arr2.length;i++){
            result2 ^=arr2[i];
        }

        int result3 = (result1 ^ result2);

        System.out.println("Missing elements:"+ result3);
    

        
    }
    
}
