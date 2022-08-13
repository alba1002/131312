public class BankAccount {
    double amount;
    public double getAmount() {
        return 0;


    }
    public void  deposit(double sum) {
        amount += sum;
        System.out.println("мы пополнили Счёт:" + " " + sum);
    }
        public void withDraw(int sum) throws LimitException {
            if (amount < sum) {
                throw new LimitException("Операция не доступно, потому что запрашиваемая сумма больше чем счет",
                        amount);
            } else {
                amount -= sum;
                System.out.println("Вы сняли со счета: " + sum);
            }

        }
    }