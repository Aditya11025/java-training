
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class june2_1 {
    public static class Student {
        int age;
        String name;
        int rollno;
        public Student(int age, String name, int rollno) {
            this.age = age;
            this.name = name;
            this.rollno = rollno;
        }
        public String toString() {
            return "name: " + name + ", age: " + age + ", rollno: " + rollno;
        }
    }
    public static class sortByName implements Comparator<Student>{
        public int compare(Student s1, Student s2){
            return s1.name.compareTo(s2.name);
        }
    }
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(55, "rohit", 12));
        list.add(new Student(45, "aditya", 14));
        list.add(new Student(56, "aman", 15));
        Collections.sort(list,new sortByName());
        for (Student s : list) {
            System.out.println(s);
        }
    }
}