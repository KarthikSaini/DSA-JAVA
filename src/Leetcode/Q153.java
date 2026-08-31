package Leetcode;

public class Q153 {

    //    Solved with binary search
    static public int findMin(int[] nums) {

        int left = 0;
        int right = nums.length-1;

        while(left < right){
            int mid = (left + right) / 2;

            if(nums[mid] > nums[mid + 1]){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        int[] input = {4,5,6,7,0,1,2};
        System.out.println("Result "+findMin(input));
    }
}
