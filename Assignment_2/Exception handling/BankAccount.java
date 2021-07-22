public class BankAccount {
    int AccNo;
    String custName;
    String AccType;
    float balance;
    public BankAccount(int AccNo,String custName,String AccType,float iniBal){
        this.AccNo=AccNo;
        this.custName=custName;
        this.AccType=AccType;
        balance=iniBal;
    }
    public void deposit(float amount) throws NegativeAmountException{
        if(amount<0){
        throw(new NegativeAmountException());
        }
        else{
            balance+=amount;
        }

    }
    public void withdraw(float amount) throws NegativeAmountException,InsuffFundsException{
        if(amount<0){
            throw(new NegativeAmountException());
        }
        if((AccType=="Savings")&&(balance<1000) || (AccType=="Current")&&(balance<5000)){
            throw(new InsuffFundsException());
        }
        balance-=amount;


    }
    public float getBalance() throws LowBalException{
        if((AccType=="Savings")&&(balance<1000) || (AccType=="Current")&&(balance<5000)){
            throw(new LowBalException());
        }
        else{return balance;}
    }

    public static void main(String[] args){
        BankAccount I=new BankAccount(3486,"illiyaz","Savings",120);
        try{
            I.deposit(100);
            I.withdraw(1000);
            System.out.println(I.getBalance());
        }
        catch(NegativeAmountException n){
            System.out.println(n.getMessage());
        }
        catch(InsuffFundsException i){
            System.out.println(i.getMessage());
        }
        catch(LowBalException l){
            System.out.println(l.getMessage());
        }

    }




}
class NegativeAmountException extends Exception{
    public NegativeAmountException(){
        super("Amount cannot be negative");
    }
}
class InsuffFundsException extends Exception{
    public InsuffFundsException(){
        super("Insufficient Balance");
    }
}
class LowBalException extends Exception{
    public LowBalException(){
        super("Account balance is too low");
    }
}
