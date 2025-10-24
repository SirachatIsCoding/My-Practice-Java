import java.util.Scanner;

public class BankAccount {
    static int balance = 10000;

    public static void main(String[] args) {
        try {
            System.out.println("Your balance is " + balance);
            Scanner kb = new Scanner(System.in);
            System.out.print("how much you want to withdraw : ");
            int money = kb.nextInt();
            kb.close();
            withDraw(money);

        } catch (Exception e) {
            e.printStackTrace();
        }    
    }

    public static void withDraw(int amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Must input number more then 0");
        }
        if (amount > balance) {
            throw new Exception("your balance is not enough");
        }
        balance -= amount;
        System.out.println("Balance = " + balance);
    }
}
