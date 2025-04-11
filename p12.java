import java .util.Scanner;
public class p12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        long fact = 1;
        for(int i=1; i<=a; i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
