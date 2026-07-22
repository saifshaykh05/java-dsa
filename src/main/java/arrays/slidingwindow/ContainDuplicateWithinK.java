package arrays.slidingwindow;

import java.util.HashSet;

public class ContainDuplicateWithinK {
    public boolean containDuplicate(int [] arr,int k){
        HashSet<Integer> temp=new HashSet<>();
        int l=0;
        for(int r=0;r<arr.length;r++){
            if(temp.contains(arr[r])){
                return true;
            }
            else {
                temp.add(arr[r]);
            }
            if(r-l+1==k){
                temp.remove(arr[l]);
                l++;
            }
        }
        return false;
    }
}
