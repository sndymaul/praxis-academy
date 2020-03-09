
    package latihan1;
    
    class Base2

{
     public void Display()
     {
         System.out.println("Base display()");
     }     
     public static void main(String args[])
     {
         Base2 t1 = new Derived();
         t1.Display();
     }    
}
class Derived extends Base2
{
     @Override
     public void Display()
     {
         System.out.println("Derived display()");
     }
}