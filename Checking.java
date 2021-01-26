import java.awt.*;

public class Checking {
    public final void text(){
       System.out.println("java");
    }

   public void text(int x){
        System.out.println(x);
    }

    static byte byteValue;
    static short shortValue;
    static int intValue;
    static long longValue;
    static float floatValue;
    static double doubleValue;
    static char charValue;
    static String stringName;
    static boolean booleanExpression;

    public static void main(String[] args) {
        final int y=100;
        System.out.println(y);

        Checking check=new Checking();
        check.text();
        check.text(10);

        System.out.println("default values of all datatypes:");
        System.out.println("byte value is " + byteValue);
        System.out.println("short value is " + shortValue);
        System.out.println("int value is " + intValue);
        System.out.println("long value is " + longValue);
        System.out.println("float value is " + floatValue);
        System.out.println("double value is " + doubleValue);
        System.out.println("char value is " +charValue);
        System.out.println("String value is " +stringName);
        System.out.println("boolean value is " +booleanExpression);

    }
}