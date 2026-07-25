package Arrays;

import java.util.HashMap;
import java.util.Map;

// Majority element (appears more than n/2 times)
public class Q12 {

    public int majorityElement(int[] arr) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i : arr){
            if(hashMap.containsKey(i)){
                hashMap.put(i,hashMap.get(i)+1);
            } else {
                hashMap.put(i,1);
            }
        }

        int value = arr.length / 2;

        for (Map.Entry<Integer,Integer> entry : hashMap.entrySet()){
            if(entry.getValue() > value){
                return entry.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,2,1,1,1,2,2};

        Q12 obj = new Q12();
        int result = obj.majorityElement(arr1);
        System.out.println(result);
    }

}
