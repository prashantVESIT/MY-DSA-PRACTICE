import java.util.HashSet;

public class Q13a {
    public static void main(String[] args) {
        int []arr1 = {1,2,3,4,5,6};
        int [] arr2 = {3,5,7,8,9};

        HashSet <Integer> a1 = new HashSet<>();
        for(int i : arr1){
            a1.add(i);
        }
        for(int i : arr2){
            a1.add(i);
        }
        System.out.println(a1);
    }
    
}
