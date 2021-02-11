public class Concate {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(a+b);
        String x="ani";
        String y="anu";
        System.out.println(x+y);
        System.out.println(a+x);
        System.out.println(x+a);
        System.out.println(x.concat(y));
        String s="anitha is \"good\" girl";
        System.out.println(s);
        String s1="anitha is \'good\' girl";
        System.out.println(s1);
        String s2="anitha\\ is good girl";
        System.out.println(s2);
        //use \n,\t,\r,\b,\f
        String m="anitha\fanu";
        System.out.println(m);
        System.out.println(x+a+b+y+a);
        System.out.println(a+b+x+y+a+b);
    }
}
