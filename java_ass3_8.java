class OutOfStockException extends Exception {
    OutOfStockException(String message) {
        super(message);
    }
}
class Product {
    String name;
    int stock;
    Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }
    void purchase(int quantity)
            throws OutOfStockException {
        if (quantity > stock) {
            throw new OutOfStockException(
                    "Product is Out Of Stock");
        }
        stock = stock - quantity;
        System.out.println(
                "Purchase Successful");
    }
}
public class java_ass3_8 {
    public static void main(String[] args) {
        Product p =
                new Product("Laptop", 5);
        try {
            p.purchase(10);
        } catch (OutOfStockException e) {
            System.out.println(
                    "Exception: "
                            + e.getMessage());
        }
    }
}