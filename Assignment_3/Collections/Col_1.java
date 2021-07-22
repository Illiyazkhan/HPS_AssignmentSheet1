import java.util.ArrayList; // ArrayList is a class
import java.util.Collection; //Collection is a interface
import java.util.Iterator;

public class Col_1 {
    public static void main(String[] args){
        int f=0;
        Collection<String> StudentList=new ArrayList<>();
        StudentList.add("Illiyaz");
        StudentList.add("Girish");
        StudentList.add("Vinith");
        StudentList.add("Pratham");
        Iterator A= StudentList.iterator();
        while(A.hasNext()){
            if(A.next()=="rahul"){
                System.out.println("This name exists");
                f=1;
            }


        }
        if(f==0){
            System.out.println("The name doesnt exist");
        }
    }
}
