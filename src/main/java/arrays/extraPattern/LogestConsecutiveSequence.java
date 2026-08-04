package arrays.extraPattern;

import java.util.HashSet;

public class LogestConsecutiveSequence {
    public int Longest(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        int longest=0;
        for(int num:arr){
            set.add(num);
        }
        for(int num:arr){
            if(!set.contains(num-1)){
                int current=num;
                int length=1;
                while (set.contains(current+1)){
                    length++;
                    current++;
                }
                longest=Math.max(longest,length);
            }
        }
        return longest;
    }
}
