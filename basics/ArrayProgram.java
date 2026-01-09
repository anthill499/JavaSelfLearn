import java.util.Arrays;

public class ArrayProgram {
    public static void main(String[] args) {
        // ArrayProgram.assignMultiplier(2);

        enhancedForLoop();
    }

    public static void assignMultiplier(int multiplier) {
        // The new keyword creates space in memory to store the array with the specific number of elements
        int[] nums = new int[3]; // The array reference variable is assigned to refer to that newly allocated array
        // The elements of the array are automatically initialized to their default value, which is 0 for integers.
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= multiplier;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void enhancedForLoop() {
        String[] names = {"Anthony", "John", "Me"};

        for (String name: names) {
            // Scope of name is limited to within loop only
            System.out.println(name);
        }
    }


}