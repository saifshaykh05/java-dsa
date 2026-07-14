package sorting;

public class MergeSort {
    public void mergersort(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        mergersort(arr, start, mid);
        mergersort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }
    public void merge(int[] arr,int start,int mid, int end){
        int[] temp=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=end){
            if(arr[i]>arr[j]){
                temp[k]=arr[j];
                j++;
            }
            else {
                temp[k]=arr[i];
                i++;
            }
            k++;
        }
        while(j<=end){
            temp[k]=arr[j];
            j++;
            k++;
        }
        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        for(int p=0;p< temp.length;p++){
            arr[p+start]=temp[p];
        }
    }
    public static void main(String[] args) {

        int[] arr = {8, 4, 2, 7, 1, 3, 6, 5};

        MergeSort obj = new MergeSort();

        obj.mergersort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
