import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AL1 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
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
        ArrayList <Integer> list2 = new ArrayList<>();
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
        List <Integer> list3 = new ArrayList<>();
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


        

    }
    
}
