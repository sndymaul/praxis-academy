package latihan2;
// A simple Java program to show multiple
// type paramaters in java Genercs

// we use < > to specify Paramater type 
 class Test2<T, U>
 {
     T obj1;    // An object of type T
     U obj2;    // An object of type U

     // constructor

     Test2(T obj1, U obj2)
     {
         this.obj1 = obj1;
         this.obj2 = obj2;
     }

     // To print objects of T and U
     public void print()
     {
         System.out.println(obj1);
         System.out.println(obj2);
     }
 }
 /**
  * Main2
  */
 public class Main2 {
 
     public static void main(String[] args) {
         Test2<String, Integer> obj = 
         new Test2<String, Integer>("Gfg", 15);
         obj.print();
     }
 }
