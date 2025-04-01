import java.util.Scanner;
public class switchCase {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days in the month:");
        int days = sc.nextInt();
        if(days>=25&&days<=28){
            System.out.println("FEB");
        }
        else if(days>=29&&days<=30){
            System.out.println("APRIL, JAN, JUNE, SEPT");
        }
        else if(days == 31){
            System.out.println("MARCH,MAY,JULY,AUGUST,OCT,DEC");
        }
        else{
            System.out.println("INVALID");
        }
    }
}
