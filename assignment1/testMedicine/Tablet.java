package assignment1.testMedicine;

class Tablet extends Medicine{
    public void displayLabel(String name,String address){
        super.displayLabel(name,address);
        System.out.println("Store in cool dry place");
    }
}