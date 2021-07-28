package assignment2.exceptionhandling.Emp;

class LowSalException extends Exception{
    public LowSalException(){
        super("Basic salary is too low");
    }
}