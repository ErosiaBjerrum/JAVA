import java.util.ArrayList;

public class Account {

    private double balance;
    private String owner;

    public Account(String owner){
        this.owner = owner;

    }

    @Override
   public String toString(){

            String s = owner + ": " + this.balance;
            return s;

    }

    public void withdraw(double amount){
        balance -= amount;

    }

    public void deposit(double amount){
        balance += amount;
    }


    public double getBalance(){
    return balance;
    }

}
