package arrays.matrix;

public class searchin2dQ240 {
    public boolean search(int [][] arr,int target){
        int row=0;
        int col=arr[0].length;
        while(row<arr.length && col >=0){
            int cur=arr[row][col];
            if (cur==target){
                return true;
            }
            else if (cur>target) {
                col--;
            }
            else {
                row++;
            }
        }
        return false;
    }
}
