class student{
    String firstname="rahul";
    String lastname="kumar";
    void fullname(){
        System.out.println(firstname+" "+lastname);
    }
}
class area{
    int length=5;
    int breadth=10;
    void area(){
        System.out.println("area of rectangle is "+length*breadth);
    }
}
public class apr22_2 {
    public static void main(String[] args) {
    student s1=new student(); 
    s1.fullname();
    area a1=new area();
    a1.area();
   }
}
