public class Reverse1 {
    public static void main(String[] args) {
        String s="Anitha";
        char a[]=s.toCharArray();
       for (int i=a.length-1;i>=0;i--){
           System.out.print(a[i]);
        }
    }
}
