import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        whileLoopFn();
    }

    public static void whileLoopFn() {
        int num;
        int num2;
        Scanner scanr = new Scanner(System.in);
        System.out.println("What's the first integer?");
        num = scanr.nextInt();
        System.out.println("What's the second integer?");
        num2 = scanr.nextInt();

        while (num != num2) {
            if (num2 > num) {
                num2 -= num;
            } else {
                num -= num2;
            }
        }

        System.out.println("Greatest Common Denominator = " + num);

    }

    /*
        for (initialExpression; conditionExpression; updateExpression) {
            // Loop body
        }
     */
}