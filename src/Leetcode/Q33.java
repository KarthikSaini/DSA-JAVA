package Leetcode;

public class Q33 {

//    static public int search(int[] nums, int target) {
//        return 0;
//    }

//    static public int search(int[] nums, int target) {
//        int left = 0;
//        int right = nums.length - 1;
//
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//
//            if (nums[mid] == target) {
//                return mid;
//            }
//
//            // Left half is sorted
//            if (nums[left] <= nums[mid]) {
//
//                if (target >= nums[left] && target < nums[mid]) {
//                    right = mid - 1;
//                } else {
//                    left = mid + 1;
//                }
//
//            }
//            // Right half is sorted
//            else {
//
//                if (target > nums[mid] && target <= nums[right]) {
//                    left = mid + 1;
//                } else {
//                    right = mid - 1;
//                }
//            }
//        }
//
//        return -1;
//    }


    public static void main(String[] args) {
//        int[] input = {4,5,6,7,0,1,2};
//        int target = 0;

//        int[] input = {-1,0,3,5,9,12};
        int[] input = {-1,0,3,5,9,12};
        int target = 1;

//        System.out.println(search(input, target));
        System.out.println(search(input, target));
    }

}
