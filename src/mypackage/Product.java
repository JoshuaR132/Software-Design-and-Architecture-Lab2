package mypackage;

public class Product {

    private double discount = 0d;
    private double fullPrice;
    private double sellingPrice;

    public Product(double fullPrice) {
        this(fullPrice, 0d);
    }

    public Product(double fullPrice, double discount) {
        this.fullPrice = fullPrice;
        this.discount = discount;
        setSellingPrice();
    }

    public void setDiscount(double discount) {
        this.discount = discount;
        setSellingPrice();
    }

    public void setFullPrice(double fullPrice) {
        this.fullPrice = fullPrice;
        setSellingPrice();
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    private void setSellingPrice() {
        sellingPrice = fullPrice - discount;
    }
}