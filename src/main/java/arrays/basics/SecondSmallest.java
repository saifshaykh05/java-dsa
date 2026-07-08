package arrays.basicarrayquestion;
public class SecondSmallest {

    public static int findSecondSmallest(int[] arr) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {

            if (num < smallest) {

                secondSmallest = smallest;
                smallest = num;

            } else if (num < secondSmallest && num != smallest) {

                secondSmallest = num;

            }

        }

        return secondSmallest;

    }

    public static void main(String[] args) {

        int[] arr = {10,5,20,8,15};

        System.out.println(findSecondSmallest(arr));

    }
}