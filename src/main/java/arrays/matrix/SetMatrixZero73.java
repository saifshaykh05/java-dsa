package arrays.matrix;

public class SetMatrixZero73 {
    public int[][] setZero(int[][] arr){
        int rows=arr.length;
        int cols=arr[0].length;
        for(int j=0;j<rows;j++){
            for(int k=0;k<cols;k++) {
                if(arr[j][k]==0){
                    if(arr[j][k]==0){
                        for(int i=0;i<=rows;i++){
                            arr[j][i]=0;
                        }
                        for(int i=0;i<=cols;i++){
                            arr[i][j]=0;
                        }
                    }
                }
            }
        }
        return arr;
    }
}
