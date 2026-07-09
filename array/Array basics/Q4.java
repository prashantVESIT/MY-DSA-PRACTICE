import java.util.*;
// Find missing element from arr if the numbers are 0-n

public class Q4 {
    public static void main(String[] args) {
        int [] arr = { 0,2,1,3};
        int n = arr.length;
        int nsum = (n*(n+1))/2;
        int arrsum =0;
        for(int i : arr){
            arrsum+=i;
        }
        System.out.println("Missing element:"+(nsum-arrsum));

    }

}
