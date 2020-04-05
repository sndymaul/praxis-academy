package latihan.satu;

/**
 * FactoryPatternDemo
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory2 shapeFactory = new ShapeFactory2();

        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Squre and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of square
        shape3.draw();
    }
}