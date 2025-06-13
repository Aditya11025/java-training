public class june5 {
    public static class MyThread extends Thread {
        public void run() {
            for (int i = 0; i <= 10; i++) {
                System.out.println(getName() + "is running with priority" + getPriority());
                Thread.yield();
            }
        }
    }
    public static void main(String[] args) {
        // System.out.println("hello world");
        // Thread t1= new Thread(()->{
        // System.out.println("hello");
        // });
        // Thread t2=new Thread(()->{
        // System.out.println("hii");
        // });
        // t2.start();
        // t1.start();
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start(); // 
        t2.start();        
    }
}
