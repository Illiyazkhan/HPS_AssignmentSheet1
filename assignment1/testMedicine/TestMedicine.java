package assignment1.testMedicine;

public class TestMedicine{
    public static void main(String[] args){
        Medicine C[]=new Medicine[10];
        for(int i=0;i<10;i++){
            int m=(int)(Math.random()*3)+1;
            if(m==1){
                C[i]=new Tablet();
            }
            if(m==2){
                C[i]=new Syrup();
            }
            if(m==3){
                C[i]=new Ointment();
            }




        }
        String name="Illiyaz";
        String address="Davangere 577004";
        for(int i=0;i<10;i++){
            C[i].displayLabel(name,address);
        }

    }
}
