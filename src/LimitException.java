public class LimitException extends Exception{


    public LimitException(String message, double remainingAmount) {
        super(message);


    }

    public int getRemainingAmount() {
        return 0;
    }
}