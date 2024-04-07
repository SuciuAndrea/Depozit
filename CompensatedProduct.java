class CompensatedProduct extends Product {
    private double coefficient;

    public CompensatedProduct(String code, String name, double basePrice, int quantity, double coefficient) {
        super(code, name, basePrice, quantity);
        this.coefficient = coefficient;
    }

    public double getPrice() {
        return getBasePrice() * coefficient;
    }
}

