package arrays.prefixsum.question;

public class ProductofArrayExceptSelf238 {
    public int[] product(int[] arr){
        int [] ans=new int[arr.length];
        ans[0]=1;
        for(int i=1;i<arr.length;i++){
            ans[i]=ans[i-1]*arr[i-1];
        }
        int pro=1;
        for(int i=arr.length-1;i>=0;i--){
            ans[i]*=pro;
            pro*=arr[i];
        }
        return ans;
    }
}
