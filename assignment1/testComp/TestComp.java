package assignment1.testComp;

public class TestComp{
    public static void main(String[] args){
        Compartment B[]= new Compartment[10];
        for(int i=0;i<10;i++){
            int m=(int)(Math.random()*4)+1;
            if(m==1){
                B[i]=new Firstclass();
            }
            if(m==2){
                B[i]=new Ladies();
            }
            if(m==3){
                B[i]=new General();
            }
            if(m==4){
                B[i]=new Luggage();
            }


        }
        for(int i=0;i<10;i++){
            B[i].notice();
        }

    }

}
