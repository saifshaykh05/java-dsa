package arrays.prefixsum.basic;

public class basicproblem {
    public int rangeSum(int[] prefix, int left, int right) {
        if (left == 0) {
            return prefix[right];
        }
        int res=prefix[right]-prefix[left-1];
        return res;
    }
}
