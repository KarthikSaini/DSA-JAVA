package Arrays;

import java.sql.Array;
import java.util.HashMap;
import java.util.Map;

// Remove duplicates from sorted array
public class Q5 {

    public int[] remDup(int[] arr){
        if(arr.length == 0){
            int[] reArr = {};
            return reArr;
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i : arr){
            hashMap.put(i,1);
        }

        int[] newArr = new int[hashMap.size()];

        int i = 0;

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            newArr[i] = entry.getKey();
            i++;
        }

        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {11,2,4,3,4,5,6,6,6,6,7};

        Q5 obj = new Q5();
        int[] result = obj.remDup(arr);

        for(int i : result){
            System.out.print(i+ " ");
        }
    }
}
