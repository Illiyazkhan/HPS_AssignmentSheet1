package esg.itp.shape;

public class Rectangle implements Polygon {
    float length,breadth;
    float area;
    float perimeter;
    public Rectangle(float l,float b){
        length=l;
        breadth=b;
    }
    public void calcPeri(){
        perimeter=2*(length+breadth);
    }
    public void calcArea(){
        area=length*breadth;
    }
    public void display(){
        System.out.println("The perimeter is "+perimeter+" and the area is "+area);
    }

}