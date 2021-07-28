package assignment2.exceptionhandling.Usertrial;

public class USERTRIAL {
    int val1;
    int val2;
    boolean show(){
        return ((val1>0)&&(val2>0));
    }
    public USERTRIAL(int val1,int val2){
        try{
            if(val1<0 || val2<0 ){
                throw(new IllegalValueException());
            }
        }
        catch(IllegalValueException i){
            System.out.println(i.getMessage());
        }
        this.val1=val1;
        this.val2=val2;
    }
    public static void main(String[] args){
        USERTRIAL u=new USERTRIAL(10,-5);
        System.out.println(u.show());
    }
}