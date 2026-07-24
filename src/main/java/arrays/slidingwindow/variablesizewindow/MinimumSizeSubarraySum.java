package arrays.slidingwindow.variablesizewindow;

public class MinimumSizeSubarraySum {
    public int minimumSubArray(int target,int[] arr){
        int sum=0;
        int l=0;
        int minlen=Integer.MAX_VALUE;
        for(int r=0;r<arr.length;r++){
            sum+=arr[r];
            while(sum>=target){
                minlen=Math.min(minlen,r-l+1);
                sum-=arr[l];
                l++;
            }
        }
        if(minlen == Integer.MAX_VALUE){
            return 0;
        }
        return minlen;
    }
}
