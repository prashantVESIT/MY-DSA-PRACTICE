import java.util.*;

// Indentify elements with highest and lowest frequency

public class Q12 {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,2,3,3,3,3,3,4,4,5};
        HashMap <Integer,Integer> freq = new HashMap<>();
        for(int i : arr){
            freq.put(i,freq.getOrDefault(i, 0)+1);
        }
        for(int key : freq.keySet()){
            System.out.println(key+" -> "+freq.get(key));
        }

        int mkey=0;
        int mValue=0;

        int minKey=1;
        int minValue = freq.get(1);

        for(int key : freq.keySet()){
            int ckey = key;
            int cValue= freq.get(key);

            if(cValue > mValue){
                mValue=cValue;
                mkey=ckey;
            }
            if(minValue > cValue){
                minKey = key;
                minValue = freq.get(key);
            }

        }

        System.out.println("Element: "+mkey+" with highest frequency: "+mValue);
        System.out.println("Element: "+minKey+" with lowest frequency: "+minValue);

    }
}
