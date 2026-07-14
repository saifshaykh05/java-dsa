package sorting;

public class QuickSort {
    public void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivotIndex = partition(arr, start, end);
        quickSort(arr, start, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, end);
    }
    public int partition(int [] arr,int start,int end){
        int i=start;
        int pivot=end;
        for(int j=start;j<=end;j++){
            if(pivot>j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        int temp=arr[i];
        arr[i]=arr[end];
        arr[end]=temp;
        return i;
    }
}
