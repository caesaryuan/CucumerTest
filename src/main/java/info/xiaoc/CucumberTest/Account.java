package info.xiaoc.CucumberTest;

/**
 * Created by ionst on 2016/1/11.
 */
public class Account {
    long balance = 0;

    public long getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void setBalance(int balance) {
        this.balance = Long.valueOf(balance);
    }
}
