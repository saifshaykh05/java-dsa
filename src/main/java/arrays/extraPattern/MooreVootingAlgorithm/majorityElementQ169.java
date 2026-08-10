package arrays.extraPattern.MooreVootingAlgorithm;

public class majorityElementQ169 {
    class Solution {
        public int majorityElement(int[] nums) {
            int can=0;
            int count=0;
            for(int num:nums){
                if(count==0){
                    can=num;
                }
                if(num==can){
                    count++;
                }
                else{
                    count--;
                }
            }
            return can;

        }
    }
}
