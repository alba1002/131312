public class BankAccount {
    double amount;
    public double getAmount() {
        return 0;


    }
    public void  deposit(double sum) {
        amount += sum;
        System.out.println("�� ��������� ����:" + " " + sum);
    }
        public void withDraw(int sum) throws LimitException {
            if (amount < sum) {
                throw new LimitException("�������� �� ��������, ������ ��� ������������� ����� ������ ��� ����",
                        amount);
            } else {
                amount -= sum;
                System.out.println("�� ����� �� �����: " + sum);
            }

        }
    }