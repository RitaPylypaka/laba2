package task3;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private final List<Shelf> shelves;

    public Warehouse() {
        shelves = new ArrayList<>();
    }

    public void addShelf(Shelf s) {
        shelves.add(s);
    }

    public void storeProduct(Product p) {
        for (Shelf shelf : shelves) {
            if (shelf.addProduct(p)) {
                System.out.println("Stored: " + p);
                return;
            }
        }
        System.out.println("Couldn't store: " + p);
    }

    public void showInventory() {
        for (Shelf shelf : shelves) {
            System.out.println(shelf);
            for (Product product : shelf.getProducts()) {
                System.out.println("  - " + product);
            }
        }
    }
}