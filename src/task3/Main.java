package task3;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 30, 20, 5);
        Product p2 = new Product("Monitor", 50, 40, 15);
        Product p3 = new Product("Keyboard", 45, 15, 5);

        Shelf shelf1 = new Shelf(100, 100, 20, 5);
        Shelf shelf2 = new Shelf(60, 50, 10, 5);

        Warehouse warehouse = new Warehouse();
        warehouse.addShelf(shelf1);
        warehouse.addShelf(shelf2);

        warehouse.storeProduct(p1);
        warehouse.storeProduct(p2);
        warehouse.storeProduct(p3);

        warehouse.showInventory();
    }
}