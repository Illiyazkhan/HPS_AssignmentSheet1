package assignment2.exceptionhandling.Usertrial;

class IllegalValueException extends Exception{
    public IllegalValueException(){
        super("Value is not legal");
    }
}