public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder();
        Trapezium trapezium = new Trapezium();
        Triangle triangle = new Triangle();
        Square square = new Square();

        printer.printer(cylinder);
    }
}
