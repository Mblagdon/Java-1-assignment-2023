package Assignment1;

/**
 * Assignment 1 - a simple object called account that has a name.
 * Note: This object is similar to example at start of chapter 3
 *
 * @author MBlagdon
 */
public class Account {

    private String name;
    private double balance;

    /**
     * Constructor that sets account name and balance
     * @param name name
     * @param balance balance
     */
    public Account(String name, double balance) {
        this.name = name;
        if(balance > 0){
            this.balance = balance;
        }
    }

    /**
     * Get the name
     * @return name
     */
    public String getName() { return name;}

    /**
     * Set name
     * @param name  name
     */
    public void setName(String name) { this.name = name; }

    /**
     * Get balance
     * @return balance
     */
    public double getBalance() { return balance; }

    /**
     * Deposit an ammount into the account. If amount is negative, ignore the deposit.
     * @param amount amount must be greater than 0
     */
    public void deposit(double amount){
        if(amount > 0) {
            this.balance += amount;
        }
        else {
            System.out.println("Deposit amount must be positive.");
            return;
        }
    }

    /**
     * Withdraw an amount from the account. If insufficent funds or amount is negative
     * nothing will happen to account balance.
     * @param amount amount attempted to withdraw must be greater than 0
     */
    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Withdrawal amount exceeded account balance.");
            return; }
        if(amount > 0){
            balance = balance - amount;
        }
        else if(amount <0){
            System.out.println("Withdrawal amount must be positive.");
            return;

        }

        }

    /**
    Reset balance
     */
    public void reset() {
        balance = 0;
    }
}
