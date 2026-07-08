package arrays.basicarrayquestion;

import java.util.Arrays;

public class MovesZeroToEnd {

    public static void moveZeros(int[] arr) {

        int index = 0;

        for (int num : arr) {

            if (num != 0) {
                arr[index++] = num;
            }

        }

        while (index < arr.length) {

            arr[index++] = 0;

        }
    }

    public static void main(String[] args) {

        int[] arr = {1,0,2,0,3,0,4};

        moveZeros(arr);

        System.out.println(Arrays.toString(arr));

    }
}
