package arrays.extraPattern;

public class ValidAnagram {
    public boolean valid(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        int[] arr1=new int[26];
        int [] arr2=new int[26];
        for (int i=0;i<s.length();i++){
            int ind1=s.charAt(i)-'a';
            arr1[ind1]++;
            int ind2=t.charAt(i)-'a';
            arr2[ind2]++;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
