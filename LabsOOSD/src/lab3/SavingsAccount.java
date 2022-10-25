package lab3;

public class SavingsAccount {
    //Variables
    private int AccountNumber = 1;
    private static int AnnualInterestRate;
    private int SavingsBalance;
    
    
    //Constructors

    public SavingsAccount(int AccountNumber, int SavingsBalance) {
        this.AccountNumber = AccountNumber++;
        this.SavingsBalance = SavingsBalance;
        
    }

   
    
    //Getters and Setters

    public int getAccountNumber() {
        return this.AccountNumber;
    }

    public void setAccountNumber(int AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public int getSavingsBalance() {
        return this.SavingsBalance;
    }

    public void setSavingsBalance(int SavingsBalance) {
        this.SavingsBalance = SavingsBalance;
    }


   
    
    //toString


    @Override
    public String toString() {
        return "{" +
            " AccountNumber='" + getAccountNumber() + "'" +
            ", SavingsBalance='" + getSavingsBalance() + "'" +
            "}";
    }

    //Misc
    public static AnnualInterestRate() {
        
    }
}
