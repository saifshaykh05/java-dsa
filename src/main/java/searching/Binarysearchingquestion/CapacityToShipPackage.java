package searching.Binarysearchingquestion;

public class CapacityToShipPackage {
    public int shipWithinDays(int[] arr, int days) {
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
    private int calculateDays(int[] weights, int capacity) {

        int days = 1;
        int currentWeight = 0;

        for (int weight : weights) {

            if (currentWeight + weight <= capacity) {
                currentWeight += weight;
            } else {
                days++;
                currentWeight = weight;
            }
        }

        return days;
    }

}
