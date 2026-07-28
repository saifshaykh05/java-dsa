package arrays.prefixsum.question;

import java.util.HashMap;

public class BinarySubarraywithSum {
    public int binarysubarraysum(int[] arr,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int count =0;
        int sum=0;
        map.put(0,1);
        for(int num:arr){
            sum+=num;
            int need=sum-k;
            if(map.containsKey(need)){
                count=map.get(need);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
    public int binarysubarraysumk(int[] arr,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int count =0;
        int sum=0;
        map.put(0,1);
        for(int num:arr){
            sum+=num;
            int need=sum-k;
            if(map.containsKey(need)){
                count=map.get(need);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
