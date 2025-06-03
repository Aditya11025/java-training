import java.util.*;
public class june2 {
   public static class student implements Comparable <student>{
        int age;
        String name;
        public student(int age,String name){
            this.age=age;
            this.name=name;
        }
        public String toString(){
            return "name"+name+" age"+age;
        }
        public int compareTo(student s){
            return this.age-s.age;
        }
    }
    public static void main(String[] args) {
        ArrayList<student>list=new ArrayList<>();
        list.add(new student(12,"rahul"));
         list.add(new student(11,"rohit"));
         Collections.sort(list);
         for(student s:list){
            System.out.println(s);;    
         }
        // ArrayList<Integer>list=new ArrayList<>();
        // list.add(1);
        // list.add(0);
        // Collections.sort(list);
        // System.out.println(list);
    }
}
