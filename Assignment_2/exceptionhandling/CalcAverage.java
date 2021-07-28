public class CalcAverage {
    int N;
    public CalcAverage(int N) throws IllegalArgumentException{
        if(N<1){
            throw (new IllegalArgumentException());

        }
        this.N=N;
    }
    public int getN(){
        return N;
    }
    public double avgFirstN(){
        return((N+1)/2);
    }
    public static void main(String[] args ){
        int N=15;
        System.out.println("The value of N is "+N);
        try{
            CalcAverage sum_N=new CalcAverage(N);
            System.out.println(sum_N.avgFirstN());
        }
        catch(IllegalArgumentException e){
            System.out.println(N+" is not a natural number");
        }
        int M=-5;
        System.out.println("The value of M is "+M);
        try{
            CalcAverage sum_M=new CalcAverage(M);
            System.out.println(sum_M.avgFirstN());
        }
        catch(IllegalArgumentException e){
            System.out.println(M+" is not a natural number");
        }
    }


}
