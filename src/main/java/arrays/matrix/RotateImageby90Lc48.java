package arrays.matrix;

public class RotateImageby90Lc48 {
    public void rotate(int [][] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=arr[j][i];
                arr[j][i]=arr[i][j];
                arr[i][j]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int l=0;
            int r=n-1;
            while (l<r){
                int temp=arr[i][r];
                arr[i][r]=arr[i][l];
                arr[i][l]=temp;
                l++;
                r--;
            }
        }

    }
}
