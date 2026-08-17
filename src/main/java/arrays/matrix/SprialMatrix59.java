package arrays.matrix;

public class SprialMatrix59 {
    public int[][] sprialmatrix(int n) {
        int[][] res = new int[n][n];
        int left = 0;
        int right = res.length - 1;
        int top = 0;
        int bottom = res.length - 1;
        int var = 1;
        while (left <= right && top <= bottom){
            for (int i = left; i <= right; i++) {
                res[top][i] = var++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                res[i][right] = var++;
            }
                right--;
            if (top <= bottom) {
                for(int i=right;i>=left;i--){
                    res[bottom][i]=var++;
                }bottom--;
            }
            if(left<=right){
                for (int i=bottom;i>=top;i--){
                    res[i][left]=var++;
                }left++;
            }

        }
        return res;
    }
}
