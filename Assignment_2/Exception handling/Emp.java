public class Emp {
    int empID;
    String Name;
    String designation;
    double basic;
    private double hra;
    public void printDET(){
        System.out.println(empID+" "+ Name+" "+ designation+" " + basic );
    }
    public double calculateHRA(){
        if(designation.equals("Manager")){
            hra=(10*basic)/100;
        }
        if(designation.equals("Officer")){
            hra=(12*basic)/100;

        }
        if(designation.equals("Clerk")){
            hra=(5*basic)/100;
        }
        return hra;
    }
    public Emp(int empId,String Name,String designation,double basic){
        try {
            if (basic < 500) {
                throw (new LowSalException());
            }
        }
        catch(LowSalException l){
            System.out.println(l.getMessage());
        }

        this.empID=empId;
        this.Name=Name;
        this.designation=designation;
        this.basic=basic;
    }
    public static void main(String[] args){
        Emp Employ= new Emp(123,"illiyaz","Officer",50);
        Employ.printDET();
        System.out.println(Employ.calculateHRA());


    }


}
class LowSalException extends Exception{
    public LowSalException(){
        super("Basic salary is too low");
    }
}
