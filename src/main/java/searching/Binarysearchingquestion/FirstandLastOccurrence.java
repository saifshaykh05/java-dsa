package searching.Binarysearchingquestion;

public class FirstandLastOccurrence {
    public int[] searchRange(int[] arr, int target) {
        int first = firstoccurrence(arr, target);
        int last = lastoccurrence(arr, target);

        return new int[]{first, last};

    }
    public int firstoccurrence(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;
            if(arr[mid]==target){
                ans=mid;
                right=mid-1;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return ans;
    }
    public int lastoccurrence(int[] arr,int target){
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;
            if(arr[mid]==target){
                ans=mid;
                left=mid+1;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
