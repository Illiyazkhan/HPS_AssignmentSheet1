package assignment1.instruTest;

public class InstruTest{
    public static void main(String[] args){
        Instrument A[] = new Instrument[10];
        A[0]=new Piano();
        A[1]=new Flute();
        A[2]=new Guitar();
        A[3]=new Piano();
        A[4]=new Flute();
        A[5]=new Guitar();
        A[6]=new Piano();
        A[7]=new Flute();
        A[8]=new Guitar();
        A[9]=new Piano();
        
        for(int i=0;i<10;i++){
            if(A[i] instanceof Piano){
            	A[i].Play();
                //System.out.println("PIANO");
            }
            if(A[i] instanceof Guitar){
            	A[i].Play();
                //System.out.println("GUITAR");
            }
            if(A[i] instanceof Flute){
            	A[i].Play();
                //System.out.println("FLUTE");
            }
        }




    }
}