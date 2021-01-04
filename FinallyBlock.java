public class FinallyBlock {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            String s=null;
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        finally{
                System.out.println("The finally block is always executed");
            }
            System.out.println("rest of the code");
        }
    }
