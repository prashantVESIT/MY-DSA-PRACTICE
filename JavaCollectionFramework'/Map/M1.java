import java.util.*;

public class M1 {
    public static void main(String[] args) {
        //Implementation through HashMap

        Map<String,String> mp = new HashMap<>();

        //insertion
        mp.put("in","India");
        mp.put("en","England");
        System.out.println(mp);

        Map<String,String> mp1 = new HashMap<>();
        mp1.put("us","United States");
        mp1.put("br","Brazil");
        System.out.println(mp1);

        mp1.putAll(mp);
        System.out.println(mp1);

        //deletion
        mp1.remove("en");
        System.out.println(mp1);

        //size()
        System.out.println(mp1.size());
        System.out.println(mp.size());

        //putIfAbsent()
        mp1.putIfAbsent("in","india3");
        System.out.println(mp1);
        mp1.putIfAbsent("en","England");
        System.out.println(mp1);

        //get()
        System.out.println(mp1.get("in"));

        //getOrDefault()
        System.out.println(mp1.getOrDefault("usa", "null"));

        //containsKey()
        System.out.println(mp1.containsKey("us"));

        //containsValue()
        System.out.println(mp1.containsValue("United States"));

        //replace()
        mp1.replace("us","United States of America");
        System.out.println(mp1);

        //keySet()--> it returns a Set of strings having All Keys
        Set<String> st = mp1.keySet();
        System.out.println(st);

        //values()--> it returns Collection of string having all the values     
        Collection<String> c1= mp1.values();
        System.out.println(c1);

        //entrySet()--> returns key-value pairs in the form of set 
        Set<Map.Entry<String,String>> es = mp1.entrySet();
        System.out.println(es);
    }
}
