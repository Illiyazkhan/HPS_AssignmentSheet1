package assignment1.testMedicine;

class Ointment extends Medicine{
    public void displayLabel(String name,String address){
        super.displayLabel(name,address);
        System.out.println("Apply on effected area");
    }
}
