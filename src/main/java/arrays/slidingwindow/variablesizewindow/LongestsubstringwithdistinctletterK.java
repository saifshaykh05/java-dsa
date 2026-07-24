package arrays.slidingwindow.variablesizewindow;

import java.util.HashMap;

public class LongestsubstringwithdistinctletterK {
    public int lengthOfLongestSubstringKDistinct(String s,int k){
        if (k == 0) {
            return 0;
        }
        int maxlen=0;
        int l=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int r=0; r<s.length();r++){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()>k){
                char lch=s.charAt(l);
                map.put(lch,map.get(lch)-1);
                if(map.get(lch)==0){
                    map.remove(lch);
                }
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
}
