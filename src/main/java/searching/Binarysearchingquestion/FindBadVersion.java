package searching.Binarysearchingquestion;
public class FindBadVersion {
    public int firstBadVersion(int n) {
        int left=0;
        int right=n;
        while(left<right){
            int mid=left+(right-left)/2;
            if(isBadVersion(mid)){ //
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;

    }
    public boolean isBadVersion(int n){
        // IN question  built function is there is badversion
        return true;//for make code correct i have used true
    }
}
