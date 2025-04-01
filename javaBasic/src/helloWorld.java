import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class helloWorld {
    public static void main(String []args){
        System.out.println("Hello World :) ");
        System.out.println("Welcome to C-DAC :) ");
        System.out.println("PG-DAI :) ");
        System.out.println("*********************** ");

        student s1 = new student();
        Class c1 = s1.getClass();
        System.out.println(c1);

        Method m1[] = c1.getDeclaredMethods();
        for (Method m: m1)
            System.out.println(m.getName());

        Field f[] = c1.getDeclaredFields();
        for (Field f1: f)
            System.out.println(f1.getName());
    }
}
class student{
    private String name;
    private int roll;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

}