import java.util.Hashtable;
import java.util.Scanner;

public class Product {

    public static void main(String[] args){
        String product_ID;
        String product_name;
        Hashtable<String,String> M= new Hashtable<String,String>();
        Scanner s=new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("Product ID: ");
            product_ID= s.nextLine();
            System.out.println("Product Name: ");
            product_name=s.nextLine();
            M.put(product_ID,product_name);
        }
        System.out.println(M);
        System.out.println("Search this product: ");
        String k=s.nextLine();

        if(M.containsValue(k)){
            System.out.println("It has the product in the list ");
        }
        else{
            System.out.println("product not found");
        }
        System.out.println("Product to be removed: ");
        String i=s.nextLine();
        M.remove(i);
        System.out.println(M);


    }
}
