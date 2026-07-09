import java.util.Arrays;
import java.util.Comparator;

public class CI3 {
    public static void main(String[] args) {
        int [] arr = {5,7,8,1,4,3,2};
        Arrays.sort(arr);
        for(int a : arr){
            System.out.print(a+"  ");
        }

        //if we want to sort in reverse order
        Integer [] arr1 = {9,3,2,8,7,6,5,10};
        Arrays.sort(arr1,new Comparator<Integer>() {
            @Override
            public int compare(Integer i1 , Integer i2){
                return i2-i1;
            }
        });
        System.out.println();
        for(int a : arr1){
            System.out.print(a+"  ");
        }

        Integer [] arr2 = {7,3,4,1,5,8,6};
        Arrays.sort(arr2,new Comparator<Integer>() {
            @Override
            public int compare(Integer i1,Integer i2){
                return -Integer.compare(i1,i2);
            }
        });
        System.out.println();
        for(int a : arr2){
            System.out.print(a+"  ");
        }
    }
    
}
