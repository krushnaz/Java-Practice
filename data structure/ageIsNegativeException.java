public class ageIsNegativeException extends Exception{
    String errorMessage;
    public ageIsNegativeException(String errorMessage){
        this.errorMessage = errorMessage;
    }
    public String toString(){
        return errorMessage;
    }
}
