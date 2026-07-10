package arrays.twopointer;

public class RemoveDuplicate {
    public int removeDuplicates(int[] arr){
        int lastuniqueposition=0;
        for (int currentpositon=1;currentpositon<arr.length;currentpositon++){
            if(arr[currentpositon]!=arr[lastuniqueposition]){
                lastuniqueposition++;
                arr[lastuniqueposition]=arr[currentpositon];
            }
        }
        return lastuniqueposition+1;
    }
}
