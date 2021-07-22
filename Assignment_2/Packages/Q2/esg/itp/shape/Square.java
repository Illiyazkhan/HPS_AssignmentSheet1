package esg.itp.shape;

public class Square implements Polygon {
    float side;
    float area;
    float perimeter;
    public Square(float s){
        side=s;
    }
    public void calcPeri(){
        perimeter=4*side;
    }
    public void calcArea(){
        area=side*side;
    }
    public void display(){
        System.out.println("The perimeter is "+perimeter+" and the area is "+area);
    }

}
