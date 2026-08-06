package searching.Binarysearchingquestion;


public class Searchin2DArray {
    public boolean search(int[][] arr,int target){
        int row=findrow(arr,target);
        if (row == -1) {
            return false;
        }
       int left=0;
       int right=arr[row].length-1;
       while (left<=right){
           int mid=left+(right-left)/2;
           if(arr[row][mid]==target){
               return true;
           }
           else if (arr[row][mid]>target) {
               right=mid-1;
           }
           else {
               left=mid+1;
           }
       }
       return false;
    }
    public int findrow(int[][] arr,int target){
        for (int i=0; i<arr.length;i++){
            if (target >= arr[i][0] && target <= arr[i][arr[i].length - 1]) {
                return i;
            }
        }
        return -1;
    }
    public boolean searchin2D(int[][] arr, int target){
        int rows=arr.length;
        int cols=arr[0].length;
        int left=0;
        int right=(rows*cols)-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            int row=mid/cols;
            int col=mid%cols;
            if(arr[row][col]==target){
                return true;
            } else if (arr[row][col]>target) {
                right=mid-1;
            }
            else {
                left=mid+1;
            }

        }


        return false;
    }

}
