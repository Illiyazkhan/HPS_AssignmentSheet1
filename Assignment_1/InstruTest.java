

abstract class Instrument {
    abstract void Play();
}
class Piano extends Instrument{
    public void Play(){
        System.out.println("Piano is playing tan tan tan tan");
    }
}
class Flute extends Instrument{
    public void Play(){
        System.out.println("Flute is playing toot toot toot toot");
    }
}
class Guitar extends Instrument{
    public void Play(){
        System.out.println("Guitar is playing tin tin tin tin");
    }
}
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
        A[0].Play();
        A[5].Play();
        A[7].Play();
        for(int i=0;i<10;i++){
            if(A[i] instanceof Piano){
                System.out.println("PIANO");
            }
            if(A[i] instanceof Guitar){
                System.out.println("GUITAR");
            }
            if(A[i] instanceof Flute){
                System.out.println("FLUTE");
            }
        }




    }
}

