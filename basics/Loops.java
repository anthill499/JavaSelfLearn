import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        String inputString;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a string: ");
        inputString = scnr.nextLine();
        
        // System.out.println("Reverse binary notation for " + num + " = " + Loops.reverseBinary(num));
        System.out.println(Loops.printReversedString(inputString));
        // Loops.NLoop(5);
    }

    public static String reverseBinary(int num) {
        String output = "";
        while (num > 0) {   
            output += num % 2;
            num /= 2;
        }
        return output;
    }

    /*
        for (initialExpression; conditionExpression; updateExpression) {
            // Loop body
        }
    */

    public static void NLoop(int n) {
        for (int i = -15; i <= 10; i += n) {
            System.out.println("Number: " + i);
        }
    } 

    public static String printReversedString(String input) {
        String output = "";
        
        for (int i = input.length()-1; i >= 0; i--) {
            output += input.charAt(i);
        }
        return output;
    }


}