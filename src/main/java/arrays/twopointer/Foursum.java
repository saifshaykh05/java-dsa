package arrays.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Foursum {
    public List<List<Integer>> fourSum(int[] arr, int target) {

        Arrays.sort(arr);

        int i = 0;
        List<List<Integer>> result = new ArrayList<>();

        while (i < arr.length - 3) {

            // Skip duplicate i
            if (i > 0 && arr[i] == arr[i - 1]) {
                i++;
                continue;
            }

            int j = i + 1;

            while (j < arr.length - 2) {

                // Skip duplicate j
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    j++;
                    continue;
                }

                int x = j + 1;
                int y = arr.length - 1;

                while (x < y) {

                    long sum = (long) arr[i] + arr[j] + arr[x] + arr[y];

                    if (sum == target) {

                        List<Integer> temp = new ArrayList<>();

                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[x]);
                        temp.add(arr[y]);

                        result.add(temp);

                        x++;
                        y--;

                        // Skip duplicate x
                        while (x < y && arr[x] == arr[x - 1]) {
                            x++;
                        }

                        // Skip duplicate y
                        while (x < y && arr[y] == arr[y + 1]) {
                            y--;
                        }

                    }
                    else if (sum < target) {
                        x++;
                    }
                    else {
                        y--;
                    }
                }

                j++;
            }

            i++;
        }

        return result;
    }
}
