package arrays.prefixsum.question;

import java.util.HashMap;

public class ContiginousArrayhavingequal0and1Q525 {
    public int maxSubarrayhavingEquals0and1(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int sum=0;
        map.put(0,-1);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                sum++;
            }
            else {
                sum--;
            }
            if(map.containsKey(sum)){
                int temp=map.get(sum);
                count=Math.max(count,i-temp);
            }
            map.put(sum,map.getOrDefault(sum,i));
        }
        return count;

    }
}
