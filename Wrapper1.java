public class Wrapper1 {
        public static void main(String[] args) {
            System.out.println("Converted from wrapper classes to string");
            Byte myByte=10;
            Short myShort=21;
            Integer myInt = 5;
            Long myLong=200l;
            Float myFloat=2.3f;
            Double myDouble = 5.99;
            Character myChar = 'A';
            Boolean myBoolean=true;

            String s1 = myByte.toString();
            System.out.println("s1= "+s1);

            String s2 = myShort.toString();
            System.out.println("s2= "+s2);

            String s3 = myInt.toString();
            System.out.println("s3= "+s3);

            String s4 = myLong.toString();
            System.out.println("s4= "+s4);

            String s5 = myFloat.toString();
            System.out.println("s5= "+s5);

            String s6 = myDouble.toString();
            System.out.println("s6= "+s6);

            String s7 = myChar.toString();
            System.out.println("s7= "+s7);

            String s8=myBoolean.toString();
            System.out.println("s8= "+s8);

            System.out.println("Converted from primitives to string");
            byte myByte1=10;
            short myShort1=21;
            int myInt1 = 5;
            long myLong1=200l;
            float myFloat1=2.3f;
            double myDouble1 = 5.99;
            char myChar1 = 'A';
            boolean myBoolean1=true;

            String a1 = Byte.toString(myByte1);
            System.out.println("a1= "+a1);

            String a2 = Short.toString(myShort1);
            System.out.println("a2= "+a2);

            String a3 = Integer.toString(myInt1);
            System.out.println("a3= "+a3);

            String a4 = Long.toString(myLong1);
            System.out.println("a4= "+a4);

            String a5 = Float.toString(myFloat1);
            System.out.println("a5= "+a5);

            String a6 = Double.toString(myDouble1);
            System.out.println("a6= "+a6);

            String a7 = Character.toString(myChar1);
            System.out.println("a7= "+a7);

            String a8=Boolean.toString(myBoolean1);
            System.out.println("a8= "+a8);



        }
    }