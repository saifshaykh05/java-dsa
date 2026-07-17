package searching.Binarysearchingquestion;

public class GuessNumber {
    public int guessNumber(int n) {
        int left=1;
        int right=n;
        while(left<=right){
            int mid=left+(right-left)/2;
            int result=guess(mid);
            if(result==1){
                left=mid+1;
            }
            else if(result==-1){
                right=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public int guess(int i){
        return -1;//for making code correct used -1 it is built in function in question
    }
}
