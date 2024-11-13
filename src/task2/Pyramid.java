package task2;

class Pyramid extends Shape {
    private final double side;
    private final double height;
    private final double slantHeight;

    public Pyramid(double side, double height) {
        this.side = side;
        this.height = height;

        this.slantHeight = Math.sqrt((side / 2) * (side / 2) + height * height);
    }

    @Override
    public double calculateArea() {

        double baseArea = side * side;

        double lateralArea = 2 * side * slantHeight;

        return baseArea + lateralArea;
    }

    @Override
    public double calculateVolume() {

        return (1.0 / 3) * (side * side) * height;
    }
}