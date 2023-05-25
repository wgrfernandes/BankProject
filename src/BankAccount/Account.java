package BankAccount;

public class Account {
    private int id;
    private int userId;
    private int accountNumber;
    private double balance;

    public Account(int id, int userId, int accountNumber){
        this.id = id;
        this.userId = userId;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    //----------METHODS----------------------------

    public double deposit(double amount){
        this.balance += amount;
        return this.balance;
    }

    public double withdraw(double amount){
        if(this.balance>=amount) {
            this.balance -= amount;
            return amount;
        }
        return 0;
    }

    //---------GETTERS AND SETTERS-----------------
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

}
