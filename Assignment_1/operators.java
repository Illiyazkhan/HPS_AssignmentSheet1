public class operators{
    public static void main(String args[]){
        if(args.length==0){
            System.out.println("Pass any arguments");
        }
        else{
            int a=Integer.parseInt(args[0]);
            String s=args[1];
            int b=Integer.parseInt(args[2]);
            switch(s){
                case "+":
                    System.out.println("Addition of a and b is: "+ (a+b));
                    break;
                case "-":
                    System.out.println("Subtraction of a and b is: "+ (a-b));
                    break;
                case "*":
                    System.out.println("Multiplication of a and b is: "+ (a*b));
                    break;
                case "/":
                    System.out.println("Division of a and b is: "+ (a/b));
                    break;
                default:
                    System.out.println("Enter valid arguments like +,-,*,/ only");

            }
        }
    }
}
