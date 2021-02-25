public class FinalizeGarbage {
    public void finalize(){
        System.out.println("object is garbage collected");
    }

    public static void main(String[] args) {
        FinalizeGarbage test=new FinalizeGarbage();
        FinalizeGarbage test1=new FinalizeGarbage();
        test=null;
        test1=null;
        System.gc();
    }
}
