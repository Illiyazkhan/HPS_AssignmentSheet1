package assignment1.carClass;

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