package arrays.slidingwindow;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class FindMaximumNumberINWindow {
    public int[] maximumNumber(int[] arr,int k){
        int[] res=new int[arr.length-k+1];
        Deque<Integer> deque=new LinkedList<>();
        int index=0;
        int left=0;
        for(int right=0;right <arr.length;right++){
            while(!deque.isEmpty() && arr[right]>arr[deque.peekLast()] ){
                deque.pollLast();
            }
            deque.offerLast(right);
            if(left>deque.peekFirst()){
                deque.pollFirst();
            }
            if(right-left+1 ==k){
                res[index++]=arr[deque.peekFirst()];
                left++;
            }
        }
        return res;
    }
}
