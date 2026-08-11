package arrays.matrix;

public class DiagonalSum1572 {
    public int diagonalsum(int[][] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];
            sum+=arr[i][arr.length-i-1];
        }
        if(arr.length%2!=0){
            sum-=arr[arr.length/2][arr.length/2];
        }
        return sum;
    }
}
