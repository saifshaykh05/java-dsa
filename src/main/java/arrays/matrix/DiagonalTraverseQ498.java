package arrays.matrix;

public class DiagonalTraverseQ498 {
    public int [] traverse(int [][] mat){
        int rols= mat.length;
        int cols=mat[0].length;

        int [] arr=new int[rols*cols];

        int row=0;
        int col=0;
        int index=0;
        boolean up=true;

        while(index<rols*cols){

            if(up){
                if(col==cols-1){
                    row++;
                    up=false;
                } else if (row==0) {
                    col++;
                    up=false;
                }
                else {
                    col++;
                    row--;
                }

            }
            else {
                    if(row==rols-1){
                        col++;
                        up=true;
                    } else if (col==0) {
                        row++;
                        up=true;
                    }
                    else {
                        col--;
                        row++;
                    }

            }
        }
        return arr;
    }
}
