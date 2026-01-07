public class SimpleStatistics {
    public static void main(String[] args) {
        int[] arr = {8,10,5,4};
        getProductAndAverage(arr);
    }
    
    public static void getProductAndAverage(int[] nums) {
        int product = 1;
        int count = 0;
        int sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
            count++;
            sum += nums[i];
        }
        System.out.println(String.format("Product: %d, Average: %d", product, sum / count));
    };

}