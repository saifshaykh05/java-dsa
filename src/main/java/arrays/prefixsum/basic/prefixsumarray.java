package arrays.prefixsum.basic;

public class prefixsumarray {
    public int[] prefixsum(int[] arr){
        int sum=0;
        int [] prefixsum=new int[arr.length];
        for (int i=0; i<arr.length;i++){
            sum+=arr[i];
            prefixsum[i]=sum;
        }
        return prefixsum;
    }
}
