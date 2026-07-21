package arrays.slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class CountNegativeNumber {
    public List<Integer> countNegative(int [] arr, int k){
        List<Integer> result=new ArrayList<>();
        int count=0;
        for(int i=0;i<k;i++){
            if( arr[i]<0){
                count++;
            }
        }
        result.add(count);
        for(int i=k;i<arr.length;i++){
            if(arr[i]<0){
                count++;
            }
            if(arr[i-k]<0){
                count--;
            }
            result.add(count);
        }
        return result;
    }
}
