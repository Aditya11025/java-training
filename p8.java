import java.util.Scanner;
public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%5==0 || a%11==0){
            System.out.println("Divisible by 5 or 11");
    }
        else{
            System.out.println("Not divisible by 5 or 11");
        }
    }
}
