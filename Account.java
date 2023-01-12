public class Account {
    // attributes
    private String name;
    private double balance;


    // constructor
    Account(String name,double balance){
        this.name = name;
        this.balance = balance;
    }



    // methods
    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBalance(double newbalance){
        this.balance = newbalance;
    }

    public void deposit(double add){
        balance = add + balance;
    }

    public void withdraw(double decrease){
        if(decrease<=balance){
            balance = balance - decrease;
        }
        else {
            System.out.println("you can't withdraw this amount");
        }

    }

}
