package arrays.kandanesAlgorithm;

public class MaximumSubarrayWithCircularSubarray918 {
    public int maximum(int[] arr){
        int total=0;

        int currentMaximumSubarray=0;
        int maximumsubarray=Integer.MIN_VALUE;
        int currentMinimumSubarray=0;
        int minimumsubarray=Integer.MAX_VALUE;
        for(int num:arr){
            total+=num;

            currentMaximumSubarray+=num;
            maximumsubarray=Math.max(currentMaximumSubarray,maximumsubarray);
            if(currentMaximumSubarray<0){
                currentMaximumSubarray=0;
            }

            currentMinimumSubarray+=num;
            minimumsubarray=Math.min(currentMinimumSubarray,minimumsubarray);
            if (currentMinimumSubarray>0){
                currentMinimumSubarray=0;
            }

        }
        if(maximumsubarray<0){
            return maximumsubarray;
        }

        int circularsum=total-minimumsubarray;
        return Math.max(circularsum,maximumsubarray);
    }

}
