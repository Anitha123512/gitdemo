class InvalidAgeException extends Exception {
    String x;

    public InvalidAgeException(String x) {
        this.x = x;
    }

}
class CustomException{

    public static void validate(int age) throws InvalidAgeException{
        if (age<18) {
            throw new InvalidAgeException("not valid");
        } else {
            System.out.println("welocome to vote");
        }
    }

    public static void main(String[] args) {
        try {
            validate(13);
        }catch (Exception e) {
            System.out.println("Exception occured: " +e);
        }
        System.out.println("rest of the code");
    }
}
