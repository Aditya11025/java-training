// class downloadFile{
//     public static void file(String file){
//         for(int i=0;i<5;i++){
//             System.out.println("Downloading..."+file+" "+i*20+"%");
//             try{
//                 Thread.sleep(1000);
//             }
//             catch(Exception e){}
//         }
//             System.out.println(file+"done");
// }
// }
// public class june3_2 {
//     public static void main(String[]args){
//        downloadFile a=new downloadFile();
//        //without thread
//          a.file("file1.txt");
//          a.file("file2.txt");
//     }
// }
class downloadFile extends Thread {
    String file;

    downloadFile(String file) {
        this.file = file;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Downloading... " + file + " " + i * 20 + "%");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
        System.out.println(file + " done");
    }
}
public class june3_2 {
    public static void main(String[] args) {
        downloadFile a = new downloadFile("file A");
        downloadFile b = new downloadFile("file B");
        a.start(); // start downloading file A  
        b.start(); // start downloading file B
        // with thread
    }
}