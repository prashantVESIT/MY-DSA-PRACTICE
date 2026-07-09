import java.util.*;

class Student implements Comparable<Student>{
    String Name;
    int Age;
    double Weight;

    Student(String Name,int Age,double Weight){
        this.Name = Name;
        this.Age = Age;
        this.Weight = Weight;
    }
       @Override
       public String toString() {
        return "Student {"+Name+", "+Age+", "+Weight+"}";
       }

       @Override
       public int compareTo(Student that){
        return this.Age-that.Age;
       }
    

}

public class CI1{
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Prashant",18,65.5));
        list.add(new Student("Rahul",21,70.8));
        list.add(new Student("Aman",19,90));
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
    
}
