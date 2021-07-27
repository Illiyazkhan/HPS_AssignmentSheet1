package assignment1.carClass;

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