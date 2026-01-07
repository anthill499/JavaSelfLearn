
import java.util.Scanner;
public class TypecastProgram {
    public static void main(String[] args) {
        int myInt;
        System.out.println("Enter an integer");
        Scanner scnr = new Scanner(System.in);
        myInt = scnr.nextInt();
        System.out.println("The new float: " + (double)myInt);
        TypecastProgram.getChar();
    }

    public static void getChar() {
        char myChar;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a char");
        myChar = scnr.next().charAt(0);
        System.out.println("Received char: " + myChar);
    }
}