import java.io.IOException;
import java.util.Scanner;

public class Number {
    int firstnumber;
    int secondnumber;
    double result;
    public Number(int a,int b){
        firstnumber=a;
        secondnumber=b;


    }
    public int get_a(){
        return firstnumber;
    }
    public int get_b(){
        return secondnumber;
    }
    public int Add(){
        return(firstnumber+secondnumber);
    }
    public double Sub(){
        return(firstnumber-secondnumber);
    }
    public double Mul(){
        return(firstnumber*secondnumber);
    }
    public double Div() throws ArithmeticException{
        if(secondnumber==0){
            throw(new ArithmeticException());
        }
        return(firstnumber/secondnumber);
    }
    public static void main(String[] args) throws IOException {
        Scanner i=new Scanner(System.in);
        Number A=new Number(10,0);
        //Number B=new Number(20,0);
        System.out.println("Addition 1: subtraction 2: Multiplication 3: Division 4");
        int a=Integer.parseInt(i.nextLine());
        System.out.println(i);
        switch(a){
            case 1:
                System.out.println(A.Add());
                break;
            case 2:
                System.out.println(A.Sub());
                break;
            case 3:
                System.out.println(A.Mul());
                break;
            case 4:
                try{
                    System.out.println(A.Div());
                }
                catch(ArithmeticException e){
                    System.out.println("cannot divide by zero");
                }
                break;


        }


    }
}
