import com.highpeak.assignments.HPS246.illiyaz.*;
public class GreeterTest {

    public static void main(String[] args){

        int b=args.length;
        if(b>0){
            Greeter obj[]=new Greeter[b];
            for(int i=0;i<b;i++){
                obj[i]=new Greeter(args[i]);
                obj[i].sayHello();
            }
            String messages[]=new String[5];
            messages[0]="Stay safe";
            messages[1]="Be happy";
            messages[2]="Take medicine";
            messages[3]="All the best";
            messages[4]="Happy bday";
            Advisor c=new Advisor(messages);
            System.out.println(c.getAdvice());
            for(int i=b-1;i>=0;i--){
                obj[i].sayGoodBye();
            }


        }
        else{
            System.out.println("Give any argument");
        }



    }

}
