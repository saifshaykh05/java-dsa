package arrays.basicarrayquestion;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] numbers) {

    if (numbers.length == 0) {
        return 0;
    }

    int lastUniquePosition = 0;

    for (int currentPosition = 1; currentPosition < numbers.length; currentPosition++) {

        if (numbers[currentPosition] != numbers[lastUniquePosition]) {

            lastUniquePosition++;

            numbers[lastUniquePosition] = numbers[currentPosition];

        }

    }

    return lastUniquePosition + 1;
}
    public static void main(String[] args) {

        int[] arr = {1,0,2,0,3,0,4};

        removeDuplicates(arr);

        System.out.println(Arrays.toString(arr));

    }
}
