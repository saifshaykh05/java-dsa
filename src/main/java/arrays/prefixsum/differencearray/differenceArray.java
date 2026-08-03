package arrays.prefixsum.differencearray;

public class differenceArray {
    public int[] difference(){
        int[] arr={0,0,0,0,0,0,0,0};
        //+5 from 1 to 3
        // +2 from 2 to 5
        //-3 from 0 to 2
        arr[1]+=5;
        arr[3+1]-=5;
        arr[2]+=2;
        arr[5+1]-=2;
        arr[0]-=3;
        arr[2+1]+=3;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            arr[i]=sum;
        }
        return  arr;
    }

    public static void main(String[] args) {
        differenceArray as=new differenceArray();
        int[] arr=as.difference();
        System.out.println(arr);
    }
}
