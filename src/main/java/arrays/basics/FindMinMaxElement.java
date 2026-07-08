package arrays.basicarrayquestion;

public class FindMinMaxElement {

    public static int findMaximum(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
    /*public  int findMinimum(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }*/

    public static void main(String[] args) {
        int[] arr = {3, 8, 2, 10, 5};
        System.out.println(findMaximum(arr));
    }
}
