package arrays.prefixsum.differencearray;

public class CarPooling1094 {
    public boolean carpool(int[][] trip,int cap){
        int [] arr=new int[1001];
        int count=0;
        for(int i=0;i<trip.length;i++){
            int pass=trip[i][0];
            int start=trip[i][1];
            int stop=trip[i][2];
            arr[start]+=pass;
            arr[stop+1]-=pass;
        }
        for(int num:arr){
            count+=num;
            if(count>cap){
                return false;
            }
        }
        return true;
    }
}
