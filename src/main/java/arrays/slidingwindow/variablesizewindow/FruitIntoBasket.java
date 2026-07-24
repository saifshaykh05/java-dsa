package arrays.slidingwindow.variablesizewindow;

import java.util.HashMap;

public class FruitIntoBasket {
    public  int totalFruit(int[] arr){
        HashMap<Integer,Integer> map =new HashMap<>();
        int maxlen=0;
        int l=0;
        for(int r=0; r<arr.length;r++){
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);
            while (map.size()>2){
              map.put(arr[l],map.get(arr[l])-1);
              if(map.get(arr[l])==0){
                  map.remove(arr[l]);
              }
              l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
}
