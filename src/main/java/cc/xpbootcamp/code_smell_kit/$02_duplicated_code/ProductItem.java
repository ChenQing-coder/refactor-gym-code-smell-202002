package cc.xpbootcamp.code_smell_kit.$02_duplicated_code;

public class ProductItem {

    private String name;
    private double price;

    public ProductItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
