
interface UPIPayment {
    void payViaUPI();
}
interface CardPayment {
    void payViaCard();
}
class OnlinePayment
        implements UPIPayment, CardPayment {
    @Override
    public void payViaUPI() {
        System.out.println(
                "Payment Successful via UPI");
    }
    @Override
    public void payViaCard() {
        System.out.println(
                "Payment Successful via Card");
    }
}
public class java_ass3_5 {
    public static void main(String[] args) {
        OnlinePayment p =
                new OnlinePayment();
        p.payViaUPI();
        p.payViaCard();
    }
}