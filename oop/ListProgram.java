import java.util.ArrayList;
import java.util.Random;
public class ListProgram {
    public static void main(String[] args) {
        ArrayListImpl arrayListImpl = new ArrayListImpl();

    }
}

// Many of Java's built-in classes, such as Java's Collection library, only work with objects
// Wrapper class objects are immutable (can not change the object via methods or variable assignments after assignment)
// Autoboxing - implicit conversion of primitives to their corresponding wrapper classes
// Unboxing - automatic conversion of wrapper to int calsses
class ArrayListImpl {
    private ArrayList<Integer> arr;

    public ArrayListImpl() {
        this.arr = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            Random rndm = new Random();
            this.arr.add(rndm.nextInt(100)+1);
        }
        this.printImpl();
        System.out.println("🚀 ArrayList created!");
    }

    public void printImpl() {
        System.out.println(this.arr);
    }

    // Insertion Sort
    public void sortArrayList() {
        this.printImpl();
    }
}