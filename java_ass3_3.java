abstract class Payment {
    String transactionId;
    double amount;
    Payment(String transactionId,
            double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }
    abstract void processPayment();
}
class CreditCardPayment extends Payment {
    CreditCardPayment(String id,
                      double amount) {

        super(id, amount);
    }
    @Override
    void processPayment() {

        double total =
                amount + (amount * 0.02);

        System.out.println(
                "Credit Card Payment = "
                        + total);
    }
}
class PayPalPayment extends Payment {
    PayPalPayment(String id,
                  double amount) {
        super(id, amount);
    }
    @Override
    void processPayment() {

        double total =
                amount + (amount * 0.03);

        System.out.println(
                "PayPal Payment = "
                        + total);
    }
}
public class java_ass3_3 {
    public static void main(String[] args) {
        Payment p1 =
                new CreditCardPayment(
                        "T101", 1000);
        Payment p2 =
                new PayPalPayment(
                        "T102", 1000);
        p1.processPayment();
        p2.processPayment();
    }
}