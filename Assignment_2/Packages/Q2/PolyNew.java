import esg.itp.shape.*;
public class PolyNew {

    public static void main(String[] args){
        Square A=new Square(5);
        Rectangle B=new Rectangle(10,20);
        A.calcPeri();
        A.calcArea();
        B.calcPeri();
        B.calcArea();
        A.display();
        B.display();
    }
}
