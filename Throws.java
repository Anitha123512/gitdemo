import java.io.IOException;

class Throws1 {
    public void method() throws IOException{
        //throw new IOException("device error");
    System.out.println("device error");
    }

}
class Throws{
    public static void main(String[] args) throws IOException {
        Throws1 th=new Throws1();
        th.method();
        System.out.println("normal flow");
        /*try {
            Throws1 th = new Throws1();
            th.method();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
        System.out.println("normal flow");*/
    }
}
