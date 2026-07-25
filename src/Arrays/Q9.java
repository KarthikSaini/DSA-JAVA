package Arrays;

import java.util.HashMap;

// Find missing number in 1 to N
public class Q9 {

    public int missingNumber(int[] arr) {

        int l = arr.length;

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i : arr){
            hashMap.put(i,1);
        }

        for(int i=1; i<=l+1; i++){
            if(!hashMap.containsKey(i)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5};

        Q9 obj = new Q9();
        int result = obj.missingNumber(arr);
        System.out.println(result);
        }
}
