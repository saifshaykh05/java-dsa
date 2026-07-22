package arrays.slidingwindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeNumberInWindow {
    public static void main(String[] args) {

        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        System.out.println(firstNegative(arr, k));
    }
    public static List<Integer> firstNegative(int[] arr,int k){
        List<Integer> result=new ArrayList<>();
        Queue<Integer> queue=new LinkedList<>();
        int left=0;
        for(int right=0;right<arr.length;right++){
            if(arr[right]<0){
                queue.offer(arr[right]);
            }
            if(right-left+1==k){
                if(queue.isEmpty()){
                    result.add(0);
                }
                else {
                    result.add(queue.peek());
                }
                if(!queue.isEmpty() && arr[left]==queue.peek()){
                    queue.poll();
                }
                left++;
            }
        }
        return result;
    }
}
