package searching.Binarysearchingquestion;

public class CapacityToShipPackage {
    public int ship(int [] arr, int days){
        int left=0;
        int right=0;
        for(int weight:arr){
            left=Math.max(weight,left);
            right+=weight;
        }
        while (left<right){
            int mid=left+(right-left)/2;
            int daysneed=calculateDays(arr,mid);
            if(daysneed<=days){
                right=mid;
            }
            else {
                left=mid+1;
            }
        }
        return left;
    }
    private int calculateDays(int[] arr,int capacity){
        int day=1;
        int currweight=0;
        for(int weight:arr){
            if(currweight+weight<=capacity){
                currweight+=weight;
            }
            else{
                day++;
                currweight=weight;
            }
        }
        return day;
    }

}
