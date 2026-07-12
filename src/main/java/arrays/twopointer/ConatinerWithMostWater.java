package arrays.twopointer;

public class ConatinerWithMostWater {
    public int maxArea(int[] arr) {
        int container=0;
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]>arr[j]){
                int temp=arr[j]*(j-i);
                if(container<temp){
                    container=temp;
                }j--;
            }
            else{
                int temp=arr[i]*(j-i);
                if(container<temp){
                    container=temp;
                }i++;
            }
        }
        return container;
    }
}
