import mypackage.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(100.0);
        product.setDiscount(20.0);
        System.out.printf("Selling Price %f%n", product.getSellingPrice());
    }
}