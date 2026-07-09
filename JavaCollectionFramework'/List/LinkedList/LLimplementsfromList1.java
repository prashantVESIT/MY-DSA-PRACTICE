import java.util.*;

public class LL1 {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        //add()
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);

        //remove()
        list.remove(3);
        System.out.println(list);

        //addAll()
        LinkedList <Integer> list2 = new LinkedList<>();
        list2.add(101);
        list2.add(102);

        list.addAll(list2);
        System.out.println(list);

        //removeAll()
        list.removeAll(list2);
        System.out.println(list);

        //size()
        System.out.println(list.size());
        System.out.println(list2.size());

        //clear()
        list2.clear();
        System.out.println(list2.size());


        Iterator <Integer> iterator = list.iterator();
        //hasNext()- it checks the next element returns true if the iteration has more elements
        //.next() -  Returns the next element in the iteration.
        while(iterator.hasNext()){
            System.out.println("Elements:" + iterator.next());
        }

        //Methods specific to List interface 
        List <Integer> list3 = new LinkedList<>();
        list3.add(10);
        list3.add(20);
        list3.add(30);
        System.out.println(list3);


        //.set(index,number)
        list3.set(0,101);
        System.out.println(list3);

        // .get(index)
        System.out.println(list3.get(0));

        Object [] arr = list3.toArray();
        for(int i = 0;i<arr.length;i++){
            System.out.println("Elements of Array: " + arr[i]);
        }

        // contains --> returns boolean 
        System.out.println(list3.contains(101));
        System.out.println(list3.contains(100));

        LinkedList <Integer> list4 = new LinkedList<>();
        list4.add(19);
        list4.add(6);
        list4.add(2);
        list4.add(12);
        System.out.println("Initial list: "+ list4);

        Collections.sort(list);
        System.out.println("Sorted list: "+ list4);


        // Sorting a list in the descending order
        Collections.sort(list4,
            Collections.reverseOrder()
        );
        System.out.println("Reversed order:"+list4);

        // .clone() : it shallow copy the list ---> it doesnt occur in LinkedList
        //ArrayList <Integer> newList =(ArrayList <Integer>) list.clone();
        //System.out.println("Cloned list: "+newList);

        //ensureCapacity()
        // list5.ensureCapacity(100);
        LinkedList <Integer> list5 = new LinkedList<>();
       
        System.out.println(list5.size());
        // it would print 0 ; as it prints the amount of the space occupied in the ArrayList
        list5.add(100);
        list5.add(200);
        System.out.println(list5.size());
        System.out.println(list5);

        //isEmpty() :returns a boolean value 
        System.out.println(list4.isEmpty());
        System.out.println(list5.isEmpty());

        //indexOf()
        System.out.println(list5.indexOf(200));

        System.out.println(list);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(40);
        System.out.println(list);
        
       


        

    }
    
    
}
