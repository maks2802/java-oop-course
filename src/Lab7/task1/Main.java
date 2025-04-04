package Lab7.task1;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(123, 1000);

        account.setBalance(500.00);

        account.deposit(300.00);
        account.withdraw(150.00);

        System.out.println("Поточний баланс: " + account.getBalance());
    }
}
