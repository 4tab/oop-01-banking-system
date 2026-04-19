package Account;

abstract class Account {
    /*
        Abstract Class: Account
        protected String accountNumber
        protected int balance (in cents)
        abstract void displayInfo()
        Methods:
        deposit(int amountInCents)
        withdraw(int amountInCents)
        getBalance()
        getAccountNumber()
    */

    private String accountNumber;
    private int balance; //always cents

    abstract void displayInfo();

    void deposit(int amountInCents){

        if (amountInCents<=0){
            throw new IllegalArgumentException("Amount must be greater than 0");
        }
        balance += amountInCents;
    }
    void withdraw(int amountIncents){

        if (amountIncents<=0){
            throw new IllegalArgumentException("Requires positive value");
        }
        if (balance<amountIncents ){
            throw new IllegalArgumentException("Insufficient funds");
        }
    }
    void getBalance(){
        //view bal
        // return or print balance...
    }
    void getAccountNumber(){
        //get cust acc number
    }

}
