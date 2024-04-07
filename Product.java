import java.util.ArrayList;

class Product {
    private String code;
    private String name;
    private double basePrice;
    private int quantity;

    public Product(String code, String name, double basePrice, int quantity) {
        this.code = code;
        this.name = name;
        this.basePrice = basePrice;
        this.quantity = quantity;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void printProduct() {
        System.out.println("Code: " + code + ", Name: " + name + ", Price: " + basePrice + ", Quantity: " + quantity);
    }
}