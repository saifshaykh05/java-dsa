package arrays.slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class CountNumberGreaterThanX {
    public List<Integer> countGreaterThanX(int [] arr, int k,int X){
        List<Integer> result=new ArrayList<>();
        int count=0;
        for(int i=0;i<k;i++){
            if( arr[i]>X){
                count++;
            }
        }
        result.add(count);
        for(int i=k;i<arr.length;i++){
            if(arr[i]>X){
                count++;
            }
            if(arr[i-k]>X){
                count--;
            }
            result.add(count);
        }
        return result;
    }
}

