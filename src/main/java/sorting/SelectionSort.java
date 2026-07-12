package sorting;

public class SelectionSort {
    public int[] selectionsort(int [] arr){
        for(int j=0;j< arr.length;j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if(arr[j]>arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
