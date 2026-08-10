package arrays.extraPattern.dutchNationalFlag;

public class SortColorQ75 {
    public int [] sort(int[] arr){
        int l=0;
        int r=arr.length-1;
        int mid=0;
        while (mid<=r){
            if(arr[mid]==0){
                int temp = arr[l];
                arr[l] = arr[mid];
                arr[mid] = temp;
                mid++;
                l++;
            } else if (arr[mid]==1) {
                mid++;
            }
            else {
                int temp = arr[r];
                arr[r] = arr[mid];
                arr[mid] = temp;
                r--;
            }
        }
        return arr;
    }

}
