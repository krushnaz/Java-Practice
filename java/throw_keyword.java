public class throw_keyword {
    static void validation(int x){

        if(x < 18){
            throw new ArithmeticException("person is not eligible for vote..");
        }
        else {
            System.out.println("the person is eligible for vote");
        }
    }
    public static void main(String[] args) {
        validation(19);
    }
}
