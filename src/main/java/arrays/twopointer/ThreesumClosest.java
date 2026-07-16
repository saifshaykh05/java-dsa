package arrays.twopointer;

import java.util.Arrays;

public class ThreesumClosest {
    public int threeSumClosest(int[] arr, int target) {
        int i=0;
        Arrays.sort(arr);
        int ans=arr[0] +arr[1]+arr[2];
        while(i<arr.length-2){
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(Math.abs(target-sum) < Math.abs(target-ans)){
                    ans=sum;
                }
                if(sum<target){
                    j++;
                }
                else if(sum>target){
                    k--;
                }
                else {
                    return sum;
                }
            }
            i++;
        }
        return ans;
    }
}
