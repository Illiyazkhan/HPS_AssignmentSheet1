package assignment2.exceptionhandling.BankAccount;

class LowBalException extends Exception{
    public LowBalException(){
        super("Account balance is too low");
    }
}
