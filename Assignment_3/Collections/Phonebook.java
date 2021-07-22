import java.util.HashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args){
        String name;
        String number;
        HashMap<String,String> P=new HashMap<String,String>();
        Scanner s=new Scanner(System.in);
        String k="";
        while(!k.equals("3")) {
            System.out.println("1 for adding entry\n2 for searching\n3 to exit ");
            k=s.nextLine();
            switch (k) {
                case "1":
                    System.out.println("enter name and phone number");
                    name = s.nextLine();
                    number = s.nextLine();
                    P.put(name, number);
                    break;
                case "2":
                    System.out.println("Entry to be searched");
                    name = s.nextLine();
                    System.out.println(P.get(name));
                    break;
                case "3":
                    break;
            }
        }

    }
}
