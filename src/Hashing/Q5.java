package Hashing;

import java.util.Arrays;
import java.util.HashSet;

// Longest consecutive sequence
public class Q5 {

    public static int longestConsecutive(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        if(nums.length == 1){
            return 1;
        }

        HashSet<Integer> hashSet = new HashSet<>();
        Arrays.sort(nums);

        for (int i : nums){
            hashSet.add(i);
        }

        if(hashSet.size() == 1){
            return 1;
        }

//        for(int i : nums){
//            System.out.print(i+ " ");
//        }

//        for (Integer num : hashSet){
//
//            for(int i=num; i < hashSet.size(); i++){
//                if(hashSet.contains(i)){
//                    max++;
//                } else {
//                    break;
//                }
//            }
//            if(result < max){
//                result = max;
//            }
//            max = 0;
//        }

        int result = 1;
        int max = 0;
//        System.out.println(result+"  result");
//        System.out.println(hashSet);

        for (Integer num : hashSet) {
            if(!hashSet.contains(num-1)){
                int i = 0;
                while(hashSet.contains(num+i)){
                    max++;
                    i++;
                }
                System.out.println(max+ " Max");
                if(result < max){
                    result = max;
                }
                max = 0;
            }
        }

        return result;
    }

//    ChatGpt
//    public static int longestConsecutive(int[] nums) {
//
//        if (nums.length == 0) {
//            return 0;
//        }
//
//        HashSet<Integer> hashSet = new HashSet<>();
//
//        // Store all unique elements
//        for (int num : nums) {
//            hashSet.add(num);
//        }
//
//        int longest = 0;
//
//        // Traverse every unique number
//        for (Integer num : hashSet) {
//
//            // Check if this number is the start of a sequence
//            if (!hashSet.contains(num - 1)) {
//
//                int current = num;
//                int length = 1;
//
//                // Count consecutive numbers
//                while (hashSet.contains(current + 1)) {
//                    current++;
//                    length++;
//                }
//
//                longest = Math.max(longest, length);
//            }
//        }
//
//        return longest;
//    }

    public static void main(String[] args) {
        int[] input = {-1,9,-3,-6,7,-8,-6,2,9,2,3,-2,4,-1,0,6,1,-9,6,8,6,5,2};
//        int[] input = {1,0,1,2};
//        int[] input = {100, 4, 200, 1, 3, 2};

        int result = longestConsecutive(input);
        System.out.println();
        System.out.println(result);
    }
}
