enum Colors {
    RED,
    GREEN,
    YELLOW
}

public class EnumExample {
        enum Level {
            Low,
            MEDIUM,
            HIGH
        }

        public static void main(String[] args) {
            Level myVar = Level.MEDIUM;
            System.out.println(myVar);
            Colors myColor=Colors.GREEN;
            System.out.println(myColor);
            for (Level myVar1:Level.values()){
                System.out.println(myVar1);
            }
            switch (myColor){
                case RED:
                    System.out.println("red color");
                    break;
                case GREEN:
                    System.out.println("green color");
                    break;
                case YELLOW:
                    System.out.println("yellow color");
                    break;
            }
        }
    }
