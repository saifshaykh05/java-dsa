package arrays.slidingwindow.variablesizewindow;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public String minWindow(String s,String t){
        if (s.length() < t.length()) {
            return "";
        }
        HashMap<Character,Integer> need=new HashMap<>();
        HashMap<Character,Integer> window=new HashMap<>();
        for(char ch : t.toCharArray()){
            need.put(ch, need.getOrDefault(ch,0)+1);
        }
        int l=0;
        int formed=0;
        int required=need.size();
        int minlen=Integer.MAX_VALUE;
        int start=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            window.put(ch,window.getOrDefault(ch,0)+1);
            if(need.containsKey(ch) && window.get(ch).intValue()==need.get(ch).intValue()){
                formed++;
            }
            while (formed==required){
                if(minlen>r-l+1){
                    minlen=r-l+1;
                    start=l;
                }
                char leftch=s.charAt(l);
                window.put(leftch,window.get(leftch)-1);
                if(need.containsKey(leftch) && window.get(leftch)<need.get(leftch)){
                    formed--;
                }
                l++;
            }
        }
        return minlen==Integer.MAX_VALUE ? "": s.substring(start,start+minlen);

    }
}
