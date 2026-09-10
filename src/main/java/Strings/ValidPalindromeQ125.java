package Strings;

public class ValidPalindromeQ125 {
    public boolean isPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        while(l<r){
            while(!Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }
            while(!Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }
            char x=Character.toLowerCase(s.charAt(l));
            char y=Character.toLowerCase(s.charAt(r));
            if(x!=y){
                return false;
            }
            l++;
            r--;

        }
        return true;
    }
}
