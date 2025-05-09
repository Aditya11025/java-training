// class Atm{
//     private int a;
//     public 
//       void setvalue(int a){
//         this.a=a;
//       }
//       int getvalue(){
//         return a;
//       }
// }
  
//    class employee{
//     private 
//     int id;
//     int salary;
//     String name;
     
//     public 
//      void setter(int id,int salary,String name){
//         this.id=id;
//         this.name=name;
//         this.salary=salary;
//      }
//      void getter(){
//         System.out.println("name:"+ name + " "+"salary:"+ salary + " "+"id:"+ id);
//      }
//    }
    //   class temperature{
    //     private double celsius;
    //     public
    //     void setter(double value){
    //       celsius=value;
    //     }
    //     double getter(){
    //         return ((celsius*9)/5)+32;
    //     }
    //   }
    class rectangle{
        private double length;
        private double breadth;
        public 
        void setter(double length,double breadth){
            this.length=length;
            this.breadth=breadth;
        }
        double area(){
            return length*breadth;
        }
        double perimeter(){
            return 2*(length+breadth);
        }
    }
public class may09 {
   public static void main(String[] args) {
    //  Atm obj=new Atm();
    //  obj.setvalue(3000);
    //  System.out.println(obj.getvalue());

    // question 2
    // employee a =new employee();
    // a.setter(1035,40000,"aditya");
    // a.getter();

    //question 3
    // temperature temp=new temperature();
    // temp.setter(40);
    // System.out.println(temp.getter());

    //question 4
    rectangle r=new rectangle();
    r.setter(30.09,20.09);
    System.out.println("area of rectangle is: "+ r.area());
   } 
}
