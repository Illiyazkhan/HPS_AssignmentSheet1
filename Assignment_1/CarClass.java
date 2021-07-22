class Car{
    protected int speed;
    protected int numOfGears;

    public void drive(int speed, int numOfGears){
        this.speed=speed;
        this.numOfGears=numOfGears;
    }
    public int getSpeed(){
        return speed;
    }
    public int getGear(){
        return numOfGears;
    }
    public void display(){
        System.out.println("The speed is: "+speed +" The number of gears are: "+numOfGears);
    }
}
class SportsCar extends Car{
    protected int Airballontype;
    public void drive(int speed,int numOfGears,int Airballontype){
        super.drive(speed,numOfGears);
        this.Airballontype=Airballontype;
    }

    public void display(){
        super.display();
        System.out.println("and airballon type is: "+Airballontype);
    }
}
public class CarClass{
    public static void main(String[] args){

        Car car_A= new Car();
        car_A.drive(80,5);
        car_A.display();

        SportsCar sportscar_B= new SportsCar();
        sportscar_B.drive(80,5,2);
        sportscar_B.display();


    }
}
