package arrays.kandanesAlgorithm;

public class MinimumSubarraySum {
    public int kadane(int[] arr){
        int currentsum=0;
        int totalsum=Integer.MAX_VALUE;
        for(int num:arr){
            currentsum+=num;
            totalsum=Math.min(totalsum,currentsum);
            if(currentsum>0){
                currentsum=0;
            }
        }
        return totalsum;
    }
}
