package arrays.kandanesAlgorithm;

public class MaximumProduct152 {
    public int maxProduct(int[] nums) {

        int maximumProduct = nums[0];
        int minimumProduct = nums[0];
        int answer = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int previousMaximum = maximumProduct;
            int previousMinimum = minimumProduct;

            maximumProduct = Math.max(nums[i],
                    Math.max(nums[i] * previousMaximum,
                            nums[i] * previousMinimum));

            minimumProduct = Math.min(nums[i],
                    Math.min(nums[i] * previousMaximum,
                            nums[i] * previousMinimum));

            answer = Math.max(answer, maximumProduct);
        }

        return answer;
    }
    public int maxProduc(int[] nums) {

        int maximumProduct = nums[0];
        int minimumProduct = nums[0];
        int answer = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int previousMaximum = maximumProduct;
            int previousMinimum = minimumProduct;

            maximumProduct = Math.max(nums[i],
                    Math.max(nums[i] * previousMaximum,
                            nums[i] * previousMinimum));

            minimumProduct = Math.min(nums[i],
                    Math.min(nums[i] * previousMaximum,
                            nums[i] * previousMinimum));

            answer = Math.max(answer, maximumProduct);
        }

        return answer;
    }
}
