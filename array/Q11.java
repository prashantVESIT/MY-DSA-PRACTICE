import java.util.*;

public class Q11 {

    //Get mode of the elements from an array
    
    public static void main(String[] args) {
        int [] arr ={1,1,2,2,2,3,3,4,4,4,4,4,5,5,6,6,6};
        Map <Integer,Integer> freq = new HashMap<>();
        for(int i : arr){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        for(int i:freq.keySet()){
            System.out.println(i+" -> "+freq.get(i));
        }
        int maxKey= -1;
        int maxValue = -1;

        for(int key : freq.keySet()){
            int currentKey = key;
            int currentValue = freq.get(key);

            if(currentValue>maxValue){
                maxValue = currentValue;
                maxKey = currentKey;
            }
        }

        System.out.println(maxKey + " and Frequency "+maxValue);
        System.out.println("Mode : "+maxKey);


    }
}
