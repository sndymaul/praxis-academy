package kasus.ClassesAndObject.nestedclasses;

/**
 * DataStructure
 */
public class DataStructure {

    // Create an array 
    private final static int SIZE = 15;
    private int[] arrayOfInits = new int[SIZE];

    public DataStructure(){
        // fill the array with ascending integer values
        for(int i = 0; i <SIZE; i++){
            arrayOfInits[i] = i;
        }
    }
    public void printEven(){
        //print out values of even indices of the array

        DataStructureIterator iterator = this.new EvenIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }
        System.out.println();
    }
    interface DataStructureIterator extends java.util.Iterator<Integer> { }
    // inner class implement the DataStructureIterator interface.
    // which extend the Iterator<Integer>interface

    private class EvenIterator implements DataStructureIterator{
        // start stepping throungh the array from the beginngin
        private int nextIndex = 0;
        public boolean hasNext(){
            //check if current element is the last in the array
            return(nextIndex <= SIZE -1);
        }
        public Integer next(){
            // record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInits[nextIndex]);

            // Get the next.even elemnt
            nextIndex += 2;
            return retValue;
        }
    }
    public static void menu(){
        // fill the array with integer values and print out only
        // values of even indecies
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
    public static void main(String s[]){
        DataStructure.menu();
    }
}