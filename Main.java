public class Main {
    public static void main(String[] args) {
        Depot depot = new Depot();
        Product product1 = new Product("001", "Product 1", 10.0, 5);
        Product product2 = new CompensatedProduct("002", "Product 2", 20.0, 3, 0.8);

        depot.addOrUpdateProduct(product1);
        depot.addOrUpdateProduct(product2);

        depot.printInventory();
    }
}