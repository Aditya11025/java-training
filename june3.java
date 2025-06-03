 class Mythread extends Thread{
    public void run(){
        System.out.println("hello");
        try{
            Thread.sleep(5000);
        }
        catch(Exception e){}
            System.out.println("Interrupted");
        
    }
 }
 public class june3 {
    public static void main(String[] args) {
        Mythread t1=new Mythread();
        t1.start();
        for(int i=0;i<5;i++)
            System.out.println(i);
    }
}
