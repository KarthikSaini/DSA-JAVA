package Leetcode;

public class Q34 {

    static public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};

        if(nums.length == 0){
            return result;
        }

        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            int mid = (left + right) / 2 ;

            if(nums[mid] < target){
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        if(nums[left] != target){
            return result;
        }

        result[0] = left;


//        for(int i=left+1; i<nums.length; i++){
//            if(nums[left] != nums[i]){
//                result[1] = i-1;
//                return result;
//            }
//        }

        right = nums.length - 1;

//        while(left < right){
//            int mid = (left + right) / 2 ;
//
//            if(nums[mid] < target+1){
//                left = mid + 1;
//            } else {
//                right = mid;
//            }
//        }
//
//        System.out.println(right);
//        result[1] = right-1;

        while(left < right){
            int mid = (left + right) / 2 ;

            if(nums[mid] < target){
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input = {1};
        int target = 1;
        int[] result = searchRange(input, target);
        System.out.println("Result "+result[0]+" "+ result[1]);
    }
}
