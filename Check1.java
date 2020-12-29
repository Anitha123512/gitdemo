import java.io.*;

class Check2 implements Serializable {
    int i=10;
static int j=20;
transient static int k=30;
final int a=5;
transient final int b=6;
}
class Check1{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Check2 num=new Check2();
        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(num);

        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Check2 n=(Check2) ois.readObject();
        System.out.println(n.i+" "+n.j+" "+n.k+" "+n.a+" "+n.b);
    }
}

