import java.util.Scanner;
public class ifElse {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the string here:");
        //String str = sc.next();

        //if(str == "Hello"){
          //  System.out.println("same");
        //}
        //else{
          //  System.out.println("DIFFERENT");
        //}
        System.out.println("Enter any boolean value(true or false):");
        boolean bool = sc.nextBoolean();
        if(bool == true){
            System.out.println("true");
        }
        else{System.out.println("FALSE");}
    }
}
