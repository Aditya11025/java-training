import java.util.Scanner; 
public class apr15 {
    public static void main(String[] args) {
       /*  for(int i=0;i<=10;i++){
          for(int j=0;j<=10;j++){
            System.out.print("*");
          }
          System.out.println();
        }
          */
       /* 
           Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int mid=a/2;
        for(int i=0;i<a;i++){
          for(int j=0;j<a;j++){
            if( j>=mid-i && j<=mid+i){
              System.out.print("*");
            }
          else{
            System.out.print(" ");
          }
        }
        System.out.println();
    }
        */
      for(int i=0;i<20;i++){
        int a=65;
        for(int j=0;j<=i;j++){
            
            System.out.print(" "+(char)a);
            a++;
        }
        System.out.println();
      }
    }
}
