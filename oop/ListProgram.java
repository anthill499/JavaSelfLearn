import java.util.ArrayList;
import java.util.Random;

// An ArrayList stores a list of items in contiguous memory locations, 
// which enables immediate access to any element at index i of 
// ArrayList v by using the get() and set() methods 

// ➡️ inserting an item at locations other than the end of the ArrayList requires making room by shifting higher-indexed items 
// vs ⬅️ the other way around
// Each shift of an item from one element to another element requires a few processor instructions
public class ListProgram {
    public static void main(String[] args) {
        ArrayListImpl arrayListImpl = new ArrayListImpl();
        arrayListImpl.print();
        arrayListImpl.sortArrayList();
        arrayListImpl.print();
    }
}

/**  Many of Java's built-in classes, such as Java's Collection library, only work with objects
Wrapper class objects are immutable (can not change the object via methods or variable assignments after assignment)
Autoboxing - implicit conversion of primitives to their corresponding wrapper classes
Unboxing - automatic conversion of wrapper to int calsses
@author Anthony
*/ 
class ArrayListImpl {
    private ArrayList<Integer> arr;

    public ArrayListImpl() {
        this.arr = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            Random rndm = new Random();
            this.arr.add(rndm.nextInt(100)+1);
        }
        System.out.println("🚀 ArrayList created!");
    }

    public void print() {
        System.out.println(this.arr);
    }

    // Insertion Sort (in-place)
    public void sortArrayList() {
        int pointer = 0;
        while (pointer < this.arr.size()-1) {
            int m = pointer; // Local minimum from [pointer+1, end of array]
            for (int curr = pointer+1; curr < this.arr.size(); curr++) {
                if (this.arr.get(curr) < this.arr.get(m)) {
                    m = curr;
                }
            }
            /*
                index swap with minimum
                Store starting index's integer value
                Set starting index cell to minimum value
                Set curr's integer value to tempPointerVal
            */ 
            Integer tempPVal = this.arr.get(pointer);
            this.arr.set(pointer, this.arr.get(m));
            this.arr.set(m, tempPVal);
            pointer++;
        }
        System.out.println("✅ ArrayList sorted!");
    }

    
}