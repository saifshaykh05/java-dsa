package arrays.twopointer;

import java.util.HashMap;

public class TwoSum {
    public int[] twosum(int[] arr, int target){
        HashMap<Integer,Integer> numberToIndex=new HashMap<>();
        for(int currentindex=0;currentindex<arr.length;currentindex++){
            int currentnumber=arr[currentindex];
            int requirednumber=target-currentnumber;
            if(numberToIndex.containsKey(requirednumber)){
                return new int[]{numberToIndex.get(requirednumber),currentindex};
            }
            numberToIndex.put(currentnumber,currentindex);
        }
        return new int[]{};
    }
}
