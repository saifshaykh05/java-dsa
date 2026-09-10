package Strings;

public class ReverseString344 {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<j){
            char a=s[i];
            char b=s[j];
            if(a!=b){
                char temp=a;
                s[i]=b;
                s[j]=temp;
            }
            i++;
            j--;
        }
    }
}
