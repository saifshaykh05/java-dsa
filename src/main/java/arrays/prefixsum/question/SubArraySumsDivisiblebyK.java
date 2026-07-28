package arrays.prefixsum.question;

import java.util.HashMap;

public class SubArraySumsDivisiblebyK {
    public int subarraydivissiblebyk(int[] arr,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int sum=0;
        map.put(0,1);
        for(int num:arr){
            sum+=num;
            int rem=sum%k;
            if(rem<0){
                rem+=k;
            }
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return count;
    }
}
