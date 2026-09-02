package Leetcode;

public class Q540 {

//    Working but need to optimise
    static public int singleNonDuplicate(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }

        if(nums[0] != nums[1]){
            return nums[0];
        }


        for(int i=0; i<nums.length-1; i = i + 2){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
        }

        return nums[nums.length-1];
    }

    public static void main(String[] args) {
        int[] input = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(input));
    }
}
