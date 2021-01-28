public class Wrapper {
        public static void main(String[] args) {
            System.out.println(" without using methods");
            Byte myByte=10;
            Short myShort=21;
            Integer myInt = 5;
            int myInt1=5;
            System.out.println(myInt1);
            Long myLong=200l;
            Float myFloat=2.3f;
            Double myDouble = 5.99;
            Character myChar = 'A';
            Boolean myBoolean=true;
            System.out.println(myByte);
            System.out.println(myShort);
            System.out.println(myInt);
            System.out.println(myLong);
            System.out.println(myFloat);
            System.out.println(myDouble);
            System.out.println(myChar);
            System.out.println(myBoolean);

            System.out.println("using methods");
            System.out.println(myByte.byteValue());
            System.out.println(myShort.shortValue());
            System.out.println(myInt.intValue());
            System.out.println(myLong.longValue());
            System.out.println(myFloat.floatValue());
            System.out.println(myDouble.doubleValue());
            System.out.println(myChar.charValue());
            System.out.println(myBoolean.booleanValue());


        }
    }
