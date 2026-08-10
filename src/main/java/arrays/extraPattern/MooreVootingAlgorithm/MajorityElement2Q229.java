package arrays.extraPattern.MooreVootingAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2Q229 {
    public List<Integer> count2(int [] arr){
        int candidate1 = 0;
        int candidate2 = 0;

        int count1 = 0;
        int count2 = 0;

        // First pass: find possible candidates
        for (int num : arr) {

            if (num == candidate1) {
                count1++;
            }
            else if (num == candidate2) {
                count2++;
            }
            else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            }
            else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }

        // Second pass: verify candidates
        count1 = 0;
        count2 = 0;

        for (int num : arr) {

            if (num == candidate1) {
                count1++;
            }

            if (num == candidate2) {
                count2++;
            }
        }

        List<Integer> result = new ArrayList<>();

        if (count1 > arr.length / 3) {
            result.add(candidate1);
        }

        if (count2 > arr.length / 3) {
            result.add(candidate2);
        }

        return result;

    }

}
