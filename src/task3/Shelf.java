package task3;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    private final double length;
    private final double width;
    private final double height;
    private final int capacity;
    private final List<Product> products;

    public Shelf(double length, double width, double height, int capacity) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.capacity = capacity;
        this.products = new ArrayList<>();
    }

    public boolean canFit(Product p) {
        return p.getLength() <= length && p.getWidth() <= width && p.getHeight() <= height;
    }

    public boolean addProduct(Product p) {
        if (products.size() < capacity && canFit(p)) {
            products.add(p);
            return true;
        }
        return false;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Shelf (L: " + length + ", W: " + width + ", H: " + height + ", Cap: " + capacity + ")";
    }
}