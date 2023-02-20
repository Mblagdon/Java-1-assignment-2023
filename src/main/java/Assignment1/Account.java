package Assignment1Account;

public class Account {

    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        if(balance > 0){
            this.balance = balance;
        }
    }

    public String getName() { return name;}

    public void setName(String name) { this.name = name; }

    public double getBalance() { return balance; }

    public void deposit(double deposit){
        if(deposit > 0) {
            this.balance += deposit;
        }
        else {
            System.out.println("Deposit amount must be positive.");
            return;
        }
    }
    public void withdraw(double withdrawal) {
        if (withdrawal > balance) {
            System.out.println("Withdrawal amount exceeded account balance.");
            return;
        }
        balance = balance - withdrawal;
    }
    public void reset() {
        balance = 0;
    }
}
