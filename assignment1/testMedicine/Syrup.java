package assignment1.testMedicine;

class Syrup extends Medicine{
    public void displayLabel(String name,String address){
        super.displayLabel(name,address);
        System.out.println("Take two tablespoon of syrup");
    }
}
