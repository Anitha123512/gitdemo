public class Check{
        void getNumber(int i){

            System.out.println(i);
            if (i % 2 == 0) {
                System.out.println("The number is even");
            } else
                System.out.println("the number is odd");
        }
        public static void main(String args[]){

            new Check().getNumber(123456);
        }

    }