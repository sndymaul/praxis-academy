package latihan.dua;

/**
 * SingletonPatternDemo
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {
        //ilegal constructor
        //compile time error: the constructor singleObjeck() is not visible
        // SingleObject object =  new SingleObject();

        // get the only object available
        SingleObject object = SingleObject.getInstance();

        //show the message

        object.showMessage();
    }
}