import java.util.*;
public class Q6imp {
    public static void main(String[] args) {
    int [] arr1 = {1,2,2,3,4,4,5};
    int [] arr2 = {2,4,3,3,6};
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
    for(int i : arr1){
        set1.add(i);

    }
    for(int i : arr2){
        set2.add(i);
    }
    set1.retainAll(set2);
    for(int i : set1){
        System.out.print(i+" ");
    }


    }
}
