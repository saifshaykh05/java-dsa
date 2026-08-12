package arrays.matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix54lcIMP {
    public List<Integer> spiral(int [][] arr){
        List<Integer> res=new ArrayList<>();
        int l=0;
        int r=arr[0].length-1;
        int top=0;
        int bot=arr.length-1;
        while(l<=r && top<=bot){
            //left to right
            for(int i=l;i<=r;i++){
                res.add(arr[top][i]);
            }
            top++;

            //top to bottom
            for(int i=top;i<=bot;i++){
                res.add(arr[i][r]);
            }
            r--;

            //right to left
            if (top <= bot) {
                for (int i = r; i >= l; i--) {
                    res.add(arr[bot][i]);
                }
                bot--;
            }
            //bottom to top
            if (l <= r) {
                for (int i = bot; i >= top; i--) {
                    res.add(arr[i][l]);
                }
                l++;
            }

        }
        return res;
    }
}
