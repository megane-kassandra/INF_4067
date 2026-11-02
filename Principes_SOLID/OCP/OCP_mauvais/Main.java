package OCP.OCP_mauvais;

public class Main {
    
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 3);
        Circle circle = new Circle(4);
        AreaCalculator areaCalculator = new AreaCalculator();
        System.out.println("Area_rectangle = '" + areaCalculator.calculateArea(rectangle) + "'");
        System.out.println("Area_circle= '" + areaCalculator.calculateArea(circle) + "'");
    }
}
