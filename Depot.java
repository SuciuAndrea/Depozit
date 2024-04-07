class Depot {
    private ArrayList<Product> products;

    public Depot() {
        this.products = new ArrayList<>();
    }

    public void addOrUpdateProduct(Product product) {
        boolean found = false;
        for (Product p : products) {
            if (p.getCode().equals(product.getCode())) {
                p.setQuantity(p.getQuantity() + 1);
                found = true;
                break;
            }
        }
        if (!found) {
            products.add(product);
        }
    }

    public void printInventory() {
        for (Product p : products) {
            p.printProduct();
        }
    }
}

