import java.util.*;

class Student {
    String Name;
    int Age;
    int Weight;

    Student(String Name,int Age,int Weight){
        this.Name = Name;
        this.Age = Age;
        this.Weight = Weight;
    }
       @Override
       public String toString() {
        return "Student {"+Name+", "+Age+", "+Weight+"}";
       }
    

}

public class Ci2{
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Prashant",18,65));
        list.add(new Student("Rahul",21,70));
        list.add(new Student("Aman",19,90));
        System.out.println(list);
        
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2){
                return s1.Age-s2.Age;
            }
            
        });
        System.out.println(list);
    }
    
}
