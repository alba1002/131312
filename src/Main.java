public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount  = new BankAccount();
        bankAccount.deposit(20000);
        while (true){
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                try {
                    System.out.println(e.getMessage());
                    bankAccount.withDraw(e.getRemainingAmount());
                } catch (LimitException ex) {

                }
                break;
            }
        }
    }
}