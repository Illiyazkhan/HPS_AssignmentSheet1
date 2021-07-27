package assignment1.carClass;

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