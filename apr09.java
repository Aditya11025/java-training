import java.util.Scanner;
public class apr09 {
    public static void main(String[] args) {

        // 1. Basic Arithmetic Operations
       /*  int a = 10, b = 5;
        System.out.println("1. Basic Arithmetic Operations:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println(); // line break

        // 2. Remainder using modulus operator
        a = 29;
        b = 4;
        System.out.println("2. Remainder using modulus operator:");
        System.out.println("Remainder: " + (a % b));
        System.out.println();

        // 3. Swap two numbers using a third variable
        a = 5;
        b = 10;
        System.out.println("3. Swap using a third variable:");
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println();

        // 4. Swap two numbers without using a third variable
        a = 5;
        b = 10;
        System.out.println("4. Swap without using a third variable:");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", b = " + b);
      
        // 9. Check if a year is a leap year
        System.out.println("9. Check if a year is a leap year:");
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
        System.out.println();

        // 10. Check if a number is divisible by 5 and 11
        System.out.println("10. Check if a number is divisible by 5 and 11:");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 5 == 0 && num % 11 == 0)
            System.out.println("Divisible by 5 and 11");
        else
            System.out.println("Not divisible by both 5 and 11");
        
*/
        // 11. Check whether a character is a vowel or consonant
        System.out.println("11. Check whether a character is a vowel or consonant:");
        System.out.print("Enter a lowercase alphabet character: ");
        
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().toLowerCase().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
         sc.close();
       
    }
}
