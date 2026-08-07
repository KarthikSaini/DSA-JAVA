package Hashing;

import java.util.HashMap;

// Subarray sum equals K
public class Q7 {

    public static int subarraySum(int[] nums, int k) {

        int total_count = 0;

        if (nums.length == 0) {
            return total_count;
        }

        int current_sum = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0,1);

//        for(int num : nums){
//            current_sum = current_sum + num;
//
//            int sum0 = current_sum-k;
//
//            if(hashMap.containsKey(sum0)){
//                total_count = total_count + hashMap.get(sum0);
//            }
//
//            hashMap.put(current_sum, hashMap.getOrDefault(current_sum, 0)+1);
//        }

        for(int num : nums){
            current_sum = current_sum + num;
            int sum0 = current_sum - k;

            if(hashMap.containsKey(sum0)){
                total_count = total_count + hashMap.get(sum0);
            }

            hashMap.put(current_sum, hashMap.getOrDefault(current_sum, 0)+1);
        }

        return total_count;
    }

    public static void main(String[] args) {
//        int[] input = {2,3,-5,5,-5,1,4};
        int[] input = {2,3,-5,5};
        int k = 5;
        int result = subarraySum(input, k);
        System.out.println(result);

    }

}
