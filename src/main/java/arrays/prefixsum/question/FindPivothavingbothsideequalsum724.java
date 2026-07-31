package arrays.prefixsum.question;

public class FindPivothavingbothsideequalsum724 {
    public int findPivot(int[] arr){
        int totalSum=0;
        for(int num:arr){
            totalSum+=num;
        }
        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<arr.length;i++){
            rightSum=totalSum-arr[i]-leftSum;
            if(rightSum==leftSum){
                return i;
            }
            leftSum+=arr[i];
        }
        return -1;
    }
}
