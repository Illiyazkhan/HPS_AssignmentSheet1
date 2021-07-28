package assignment2.exceptionhandling.BankAccount;

class InsuffFundsException extends Exception{
    public InsuffFundsException(){
        super("Insufficient Balance");
    }
}