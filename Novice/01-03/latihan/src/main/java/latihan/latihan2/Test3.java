package latihan2;

// A Simple java program to demonstrate that NOT using 
// generics can cause run time exeptions
import java.util.*;

/**
 * Test2
 */
class Test3 {

    public static void main(String[] args) {
        // Creatings an Array without any type specified

        ArrayList <String> al = new ArrayList<String> ();

        al.add("Sachin");
        al.add("Rahul");
        //al.add(10);     // Compiler allows this
        
        String s1 = (String)al.get(0);
        String s2 = (String)al.get(1);

        // Cause Runtime Exception
        System.out.println((s1));
        System.out.println((s2));

    }
}