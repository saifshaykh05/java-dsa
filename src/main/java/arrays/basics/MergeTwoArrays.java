package arrays.basicarrayquestion;
import java.util.Arrays;

public class MergeTwoArrays {

    public static int[] merge(int[] arr1, int[] arr2) {

        int[] merged = new int[arr1.length + arr2.length];

        int index = 0;

        for (int num : arr1) {
            merged[index++] = num;
        }

        for (int num : arr2) {
            merged[index++] = num;
        }

        return merged;
    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        System.out.println(Arrays.toString(merge(arr1, arr2)));

    }
}
