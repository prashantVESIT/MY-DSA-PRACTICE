import java.util.*;

public class Set1 {
    public static void main(String[] args) {
        //Set doesnt have specific order of the elements 
        //HashSet -->  
        Set<Integer> s1 = new HashSet<>();
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        System.out.println(s1);

        Set<Integer> s2 = new HashSet<>();
        s2.add(30);
        s2.add(40);
        s2.add(50);
        System.out.println(s2);

        //retainsAll() --> replace common elements in the set1
        s1.retainAll(s2);
        System.out.println(s1);

        //containsAll() --> checks whether all the elements are present in the set 
        System.out.println(s1.containsAll(s2));
        System.out.println(s2.containsAll(s1));


        //LinkedHashSet--> if you want to preserve order of the elements 
        Set <Integer> st = new LinkedHashSet<>();
        st.add(11);
        st.add(12);
        st.add(14);
        st.add(13);
        System.out.println(st);

        //TreeSet --> it arranges in ascending order 
        Set <Integer> st1 = new LinkedHashSet<>();
        st1.add(21);
        st1.add(22);
        st1.add(24);
        st1.add(23);
        System.out.println(st1);

        st1.addAll(st); //Union
        System.out.println(st1);

        st1.removeAll(st);//Difference
        System.out.println(st1);

        st1.retainAll(st);//Intersection
        System.out.println(st1);

        

        







    }
    
}
