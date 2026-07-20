package arrays.slidingwindow;

public class FindMaximumAverage {
    public double findMaxAverage(int[] arr, int k) {
        int windowSum=0;

        for(int i=0;i<k;i++){
            windowSum+=arr[i];
        }
        int maxSum=windowSum;
        for(int i=k;i<arr.length;i++){
            windowSum-=arr[i-k];
            windowSum+=arr[i];
            maxSum=Math.max(windowSum,maxSum);
        }
        return (double) maxSum/k;
    }
}
