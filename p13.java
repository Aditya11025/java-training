import java.util.Scanner;
public class p13 {
    public static void main(String[] args) {
    }
    Scanner sc =new Scanner(System.in);
    int a = sc.nextInt();
    int reverse=0;
    while(a!=0){
        reverse = reverse*10+a%10;
        a = a/10;
    }
    System.out.println("Reverse of the number is: " + reverse);
}
