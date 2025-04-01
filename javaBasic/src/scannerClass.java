import java.util.Scanner;

public class scannerClass {
    public static void main(String []args){
       // System.out.println("""
         //       hello
                
           //     world!""");
        //System.out.println("Hello");
        //System.out.println("World");
        Scanner Sc = new Scanner(System.in);
        byte total = 116;
        byte exchange = 104;
        int saving = total - exchange;


        System.out.println("Total amount left after exchange:" + saving);

        System.out.println("Enter the first number :");
        int a = Sc.nextInt();
        System.out.println("Enter the second number:");
        int b = Sc.nextInt();
        System.out.println(a-b);
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
}
