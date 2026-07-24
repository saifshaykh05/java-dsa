package arrays.slidingwindow.variablesizewindow;

import java.util.HashSet;

public class LongestSubstringWithoutDupliacte {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int maxLen=0;
        HashSet<Character> unique=new HashSet<>();
        if(s.length()==0){
            return 0;
        }
        for(int r=0;r<s.length();r++){
            while(unique.contains(s.charAt(r))){
                unique.remove(s.charAt(l));
                l++;
            }
            unique.add(s.charAt(r));
            maxLen=Math.max(maxLen,r-l+1);

        }
        return maxLen;
    }
}
