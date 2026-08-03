package arrays.prefixsum.differencearray;

public class Coperateflightbooking1109 {
    public int[] flight(int[][] flight,int n){
        int [] arr=new int[n];
        int sum=0;
        for(int i=0;i<flight.length;i++){
            int fromflight=flight[i][0];
            int toflight=flight[i][1];
            int seats=flight[i][2];
            arr[fromflight]+=seats;
            if(arr[toflight+1]<n){
                arr[toflight+1]-=seats;
            }
        }
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
            arr[i]=sum;
        }
        return arr;
    }
}
