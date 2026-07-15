package arrays.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        int i=0;
        List<List<Integer>> ans=new ArrayList<>();
        while(i<arr.length-2){
            if (i > 0 && arr[i] == arr[i - 1]) {
                i++;
                continue;
            }
            int j=i+1;
            int k=arr.length-1;
            int target=-1*arr[i];
            while(j<k){
                int temp=arr[j]+arr[k];
                if(temp==target){
                    List<Integer> result=new ArrayList<>();
                    result.add(arr[i]);
                    result.add(arr[j]);
                    result.add(arr[k]);
                    ans.add(result);
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }
                    while (j < k && arr[k] == arr[k + 1]) {
                        k--;
                    }
                }
                else if(temp < target){
                    j++;
                }
                else{
                    k--;
                }

            }
            i++;
        }
        return ans;
    }
}
