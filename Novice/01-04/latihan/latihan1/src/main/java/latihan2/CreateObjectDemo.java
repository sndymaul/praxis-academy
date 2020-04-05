package latihan2;


/**
 * CreateObjectDemo
 */
public class CreateObjectDemo {

    public static void main(String[] args) {
        CreateObjectDemo a =new CreateObjectDemo();
        a.run();
    }
    private void run(){

            // Declare and create a point object and two rectanggle objects.

        Point originOne = new Point (23, 94);
        Rectangle rectOne = new Rectangle(originOne, 100, 200);
        Rectangle rectTwo = new Rectangle(50, 100);

        // display rectOne's width, height, and area
        System.out.println("Width of rectOne: "+ rectOne.width);
        System.out.println("Height of rectOne: " + rectTwo.height);
        System.out.println("Area of rectOne: " + rectOne.getArea());

        // set rectTwo's position
        
        rectTwo.origin = originOne;

        // display rectTwo's position
        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y Posistion of rectTwo: " + rectTwo.origin.y);
        
        // move rectTwoand dispaly its new position

        rectTwo.move(40, 72);
        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y position of rectTwo: " + rectTwo.origin.y);
        
    }
    public class Point{
        public int x = 0;
        public int y = 0;

        // a constructor!@
        public Point(int a, int b){
            x = a;
            y = b;
        }
    }
    public class Rectangle{
        public int width = 0;
        public int height = 0;
        public Point origin;

        // four constructor
        public Rectangle(){
            origin = new Point(0, 0);
        }
        public Rectangle(Point p){
            origin = p;
        }
        public Rectangle(int w, int h ){
            origin = new Point(0, 0);
            width = w;
            height = h;
        }
        public Rectangle(Point p, int w, int h){
            origin = p;
            width = w;
            height = h;
        }

        // amethod for moving the rectangle
        public void move(int x, int y){
            origin.x = x;
            origin.y = y;
        }

        // a method for computing the area of rectangle
        public int getArea(){
            return width * height;
        }
    }
    
}