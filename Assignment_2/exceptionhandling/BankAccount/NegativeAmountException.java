package assignment2.exceptionhandling.BankAccount;

class NegativeAmountException extends Exception{
    public NegativeAmountException(){
        super("Amount cannot be negative");
    }
}