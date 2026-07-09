// Fruit Into Baskets (Maximum Fruits in Two Baskets)

// Problem Description

// You are given an array arr, where each integer represents a type of fruit growing on a tree.

// You have 2 baskets, and each basket can hold only one type of fruit, but an unlimited quantity of that type.

// Starting from any tree, you must pick exactly one fruit from every consecutive tree while moving to the right.

// You must stop when you encounter a fruit that cannot fit into either basket.

// Find the maximum number of fruits you can collect.



import java.util.*;
public class Q61 {
    public static void main(String[] args) {
        int [] arr = {2,2,3,4,3,2,2,4};
        Map<Integer,Integer> m = new HashMap<>();
        int basket = 2;
        int n = arr.length;
        int s= 0;
        int e = 0;
        int maxFruits=0;

        while(e<n){
            m.put(arr[e],m.getOrDefault(arr[e],0)+1);
            
            while(m.size()>basket){
                if(m.get(arr[s])==1){
                    m.remove(arr[s]);
                    s++;
                }
                else{
                    m.put(arr[s],m.get(arr[s])-1);
                    s++;
                }

            }

            
            int fruits =e-s+1;
            maxFruits = Math.max(fruits,maxFruits);
        
            e++;

        }
        System.out.println(maxFruits);


        
    }
}
