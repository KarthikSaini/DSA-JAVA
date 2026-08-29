package Leetcode;

public class Q704 {

        static public int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length-1;

            while(left <= right){
                int mid = (left + right)/2;

                if(nums[mid]==target){
                    return mid;
                }

                if(target > nums[mid]){
                    left = mid+1;
                } else {
                    right = mid-1;
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5};
        int target = 4;

        System.out.println(search(input,target));
    }

}
