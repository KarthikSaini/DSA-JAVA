package Arrays;

import java.util.HashMap;
import java.util.Map;

// Union of two sorted arrays
public class Q8 {

    public int[] unionOfTwoArr(int[] arr1, int[] arr2) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i : arr1){
            hashMap.put(i,1);
        }

        for(int i : arr2){
            hashMap.put(i,1);
        }

        int pt = 0;
        int[] result = new int[hashMap.size()];

        for(Map.Entry<Integer,Integer> entry : hashMap.entrySet()){
            result[pt] = entry.getKey();
            pt++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,3,4};
        int[] arr2 = {1,2,3,3,4,5};

        Q8 obj = new Q8();
        int[] result = obj.unionOfTwoArr(arr1, arr2);

        for(int i : result){
            System.out.print(i+ " ");
        }
    }
}
