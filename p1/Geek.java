
// Java program to illustrate default modifier
package p1;

// Class Geeks is having Default access modifier
 public class Geek
{
     public void display()
    {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        Geek a=new Geek();
        a.display();
    }
}
