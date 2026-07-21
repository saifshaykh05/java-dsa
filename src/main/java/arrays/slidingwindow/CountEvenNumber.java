package arrays.slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class CountEvenNumber {
    public List<Integer> countEven(int[] arr,int k ){
        List<Integer> result=new ArrayList<>();
        int count=0;
        for(int i=0;i<k;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        if(count==0){
            result.add(0);
        }
        else{
            result.add(count);
        }
        for(int i=k;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
            if(arr[i-k]%2==0){
                count--;
            }
            result.add(count);
        }
        return result;
    }

}
