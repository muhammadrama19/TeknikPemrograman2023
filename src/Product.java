class Product {
    private String product_name;
    private int price;
    private int stock;

    public Product(String product_name, int price, int stock) {
        this.product_name = product_name;
        this.price = price;
        this.stock = stock;
    }

    public String getProductName() {
        return product_name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}