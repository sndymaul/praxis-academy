package latihan.satu;

/**
 * AbstractFactoryPatternDemo
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        // get rounded shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
    
        //get an object of shape rounded rectangle
        Shape shape1 = shapeFactory.getShape("RECTANGLE");

        //call draw method of shape rectangle
        shape1.draw();

        //get an object of shape rounded square
        Shape shape2 = shapeFactory.getShape("SQUARE");

        //call draw method of shape square 
        shape2.draw();

        //get rounded shape factory
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);

        //get an object of shape rectangle

        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        //call draw method of shape rectangle
        shape3.draw();

        //get an object of shape square
        Shape shape4 = shapeFactory1.getShape("SQUARE");
        //call draw method of shape square

        shape4.draw();
    }
}