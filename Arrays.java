public class Arrays {
        public static void main(String[] args){
            String[] languages={"c","JAVA","c++"};//declaration and assign values to an array
            int[] num={10,20,30};//declaration af an array and assign values to an array
            num[0]=50;//change the first element of an array
//using for loop
            byte[] values={1,2,3,4,5};
            for(byte i=0;i<values.length;i++){
                System.out.println(values[i]);
            }
//using for each loop
            String[] names={"Ani","Reddi","Sekhar"};
            for(String j:names){
                System.out.println(j);
            }
            int[] a={100,200,300,400,500};
            System.out.println(a.length);//length of an array
            System.out.println(languages[0]);
            System.out.println(languages[1]);
            System.out.println(languages[2]);
            System.out.println(num[0]);
            System.out.println(num[1]);
            System.out.println(num[2]);
        }
    }

