package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsQ438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        if(p.length()>s.length()){
            return res;
        }
        int [] arr1=new int[26];
        int [] arr2=new int[26];
        for(int i=0;i<p.length();i++){
            arr1[p.charAt(i)-'a']++;
            arr2[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(arr2,arr1)){
            res.add(0);
        }
        for(int i=p.length();i<s.length();i++){
            arr2[s.charAt(i)-'a']++;
            arr2[s.charAt(i-p.length())-'a']--;
            if(Arrays.equals(arr2,arr1)){
                res.add(i-p.length()+1);
            }
        }
        return res;
    }
}
