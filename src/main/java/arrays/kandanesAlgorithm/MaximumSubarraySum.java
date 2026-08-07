package arrays.kandanesAlgorithm;

public class MaximumSubarraySum {
    public int kadane(int[] arr){
        int currentsum=0;
        int totalsum=Integer.MIN_VALUE;
        for(int num:arr){
            currentsum+=num;
            totalsum=Math.max(totalsum,currentsum);
            if(currentsum<0){
                currentsum=0;
            }
        }
        return totalsum;
    }
}
