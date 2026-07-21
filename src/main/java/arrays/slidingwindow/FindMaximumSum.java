package arrays.slidingwindow;

import java.util.ArrayList;
import java.util.Queue;

public class FindMaximumSum {
    public int findmax(int[] arr,int k){
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int maxSum=sum;
        for(int i=k;i<arr.length;i++){
            sum-=arr[i-k];
            sum+=arr[i];
            maxSum=Math.max(sum,maxSum);
        }
        return maxSum;
    }

    public ArrayList<Integer> duplicate(int[] arr,int k){
        ArrayList<Integer> result=new ArrayList<>();
        int [] temp =new int[k];
        for(int i=k;i<arr.length;i++){
            int num=0;
            for(int j=i-k;j<i;j++){
                if(arr[j]<0){
                    result.add(arr[j]);
                    break;
                }
                else{
                    num+=1;
                }
                if(num==3){
                    result.add(0);
                }

            }
        }
        return result;
    }
}
