import java.lang.reflect.Array;
import java.util.*;
class transaction {
    private String type;
    private double amount;

    public transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

}
class acount{
    private  String name;
    private int accountno;
    private double balance;
    public acount(String name,int accountno,double balance){
        this.name=name;
        this.accountno=accountno;
        this.balance=balance;
    }
    ArrayList<transaction> transactions = new ArrayList<>();
    public void deposit(double amount) {
        balance += amount;
        transactions.add(new transaction("Deposit", amount));
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add(new transaction("Withdraw", amount));
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
    public double getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }
    public int getAccountno() {
        return accountno;
    }
    public ArrayList<transaction> getTransactions() {
        return transactions;
    }
    public void printTransactions() {
        System.out.println("Transaction history for account " + accountno + ":");
        for (transaction t : transactions) {
            System.out.println(t.getType() + ": " + t.getAmount());
        }
    }
}
public class june10 {
    public static void main(String[] args) {
       System.out.println("WELCOME");
       try{
        Thread.sleep(2000);
       } 
       catch(Exception e){
       }
         Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name:");
            String name = sc.nextLine();
            System.out.println("Enter your account number:");
            int accountno = sc.nextInt();
            System.out.println("Enter initial balance:");
            double initialBalance = sc.nextDouble();
            acount myAccount = new acount(name, accountno, initialBalance);
            boolean exit = false;
            while (!exit) {
                System.out.println("Choose an option:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. View Transactions");
                System.out.println("5. Exit");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter amount to deposit:");
                        double depositAmount = sc.nextDouble();
                        myAccount.deposit(depositAmount);
                        System.out.println("Deposited: " + depositAmount);
                        break;
                    case 2:
                        System.out.println("Enter amount to withdraw:");
                        double withdrawAmount = sc.nextDouble();
                        myAccount.withdraw(withdrawAmount);
                        break;
                    case 3:
                        System.out.println("Current balance: " + myAccount.getBalance());
                        break;
                    case 4:
                        myAccount.printTransactions();
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice, please try again.");
                }
            }
            sc.close();
        System.out.println("Thank you for using our banking system. Goodbye!");

       }
    }

