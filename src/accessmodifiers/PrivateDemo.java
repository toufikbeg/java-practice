class BankAccount {
    private double balance = 5000.0;

    private void showBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println("Fields in main: " + account.balance);
        account.showBalance();
    }
}

class Hacker extends BankAccount {
    void tryAccess() {
        System.out.println("Private fields and methods are not accessible here");
    }
}

public class PrivateDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.showBalance();
        Hacker h = new Hacker();
        h.tryAccess();
    }
}
