package src;
class MyException extends Exception{
    //String x;
    public MyException(String x){

        super(x);
    }
}

public class CustomException1 {
    public static void main(String[] args) {
        try {
            throw new MyException("anitha");
        } catch (MyException ex) {
            System.out.println("caught");
            System.out.println(ex.getMessage());
        }
    }
}
