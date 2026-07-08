package arrays.basicarrayquestion;

public class CountOccurence {

    public static int count(int[] arr, int target) {

        int count = 0;

        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 2, 4};

        System.out.println(count(arr, 2));

    }
}
