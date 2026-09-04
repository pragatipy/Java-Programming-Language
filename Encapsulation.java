public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(500);
        System.out.println("Current balance: " + account.getBalance());
    }
}
class BankAccount{
    private double balance;
    void deposit(double amount){
        balance=balance+amount;
    }
    void withdraw(double amount){
        balance=balance-amount;
    }
    //getter and setter

    public double getBalance() {
        return balance;
    }
}