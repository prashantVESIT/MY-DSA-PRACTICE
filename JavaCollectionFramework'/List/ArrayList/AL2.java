import java.util.*;

public class AL2 {
    public static void main(String[] args) {
        // Methods specific to ArrayList interface

        //sort() --> arranges in ascending order
        // Arraylist/List belongs to java collection framework hencefort it is written as Collections.sort()
        ArrayList <Integer> list = new ArrayList<>();
        list.add(19);
        list.add(6);
        list.add(2);
        list.add(12);
        System.out.println("Initial list: "+ list);

        Collections.sort(list);
        System.out.println("Sorted list: "+ list);


        // Sorting a list in the descending order
        Collections.sort(list,
            Collections.reverseOrder()
        );
        System.out.println("Reversed order:"+list);

        // .clone() : it shallow copy the list
        ArrayList <Integer> newList =(ArrayList <Integer>) list.clone();
        System.out.println("Cloned list: "+newList);

        //ensureCapacity()
        ArrayList <Integer> list2 = new ArrayList<>();
        list2.ensureCapacity(100);
        System.out.println(list2.size());
        // it would print 0 ; as it prints the amount of the space occupied in the ArrayList
        list2.add(100);
        list2.add(200);
        System.out.println(list2.size());
        System.out.println(list2);

        //isEmpty() :returns a boolean value 
        System.out.println(list.isEmpty());
        System.out.println(list2.isEmpty());

        //indexOf()
        System.out.println(list2.indexOf(200));

    }
    
}
