package arrays.prefixsum.question;

import java.util.HashMap;

public class CountNumbersofNiceSubarray {
    public int countnumber(int[] arr,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        map.put(0,1);
        int sum=0;
        for(int num:arr){
            if(num%2!=0){
                sum+=1;
            }
            else {
                sum-=0;
            }
            int need=sum-k;
            if(map.containsKey(need)){
                count+=map.get(need);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);

        }
        return count;
    }
}
