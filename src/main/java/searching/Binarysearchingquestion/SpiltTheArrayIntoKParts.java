package searching.Binarysearchingquestion;

public class SpiltTheArrayIntoKParts {
    public  int spilt(int [] nums, int k){
        int left = 0;
        int right = 0;

        // Search Space
        for (int num : nums) {
            left = Math.max(left, num);
            right += num;
        }

        while (left < right) {

            int mid = left + (right - left) / 2;

            int subArrays = countSubArrays(nums, mid);

            if (subArrays <= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
    private int countSubArrays(int[] nums, int maxSum) {

        int currentSum = 0;
        int subArrays = 1;

        for (int num : nums) {

            if (currentSum + num <= maxSum) {
                currentSum += num;
            } else {
                subArrays++;
                currentSum = num;
            }
        }

        return subArrays;
    }
}
