package OCP.OCP_bon;

public class Main {
    public static void main(String[] args){

        Shape shape1 = new Rectangle(4, 3);
        System.out.println("Area_rectangle = '" +
        shape1.calculateArea() + "'");

        Shape shape2 = new Circle(4);
        System.out.println("Area_circle = '" +
        shape2.calculateArea() + "'");
    }
}
