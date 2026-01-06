// A program starts in main(), executing the statements within main's braces { }, one at a time.
// Each statement typically appears alone on a line and ends with a semicolon, as English sentences end with a period.
import java.util.Scanner;

/*
 * A Scanner is a text parser that can get numbers, words, or phrases from an input source such as the keyboard. 
 * Getting input is achieved by first creating a Scanner object via the statement: 
 * Scanner scnr = new Scanner(System.in);.
 */
public class FirstProgram {
    public static void main(String[] args) {
    int wage;

      Scanner scnr = new Scanner(System.in);
      System.out.print("Please enter an integer");
      wage = scnr.nextInt();
      
      System.out.print("Salary is ");
      System.out.println(wage * 40 * 52);
    }
}