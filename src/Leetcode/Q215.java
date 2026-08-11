package Leetcode;

public class Q215 {

    public static int findKthLargest(int[] nums, int k) {

        // Working fine
        int largest = Integer.MIN_VALUE;
        int index = -1;
        int last = largest;

        int result = -1;
        for(int i=0; i<k; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[j] > largest){
                    largest = nums[j];
                    index = j;
                }
            }
            nums[index] = Integer.MIN_VALUE;
            last = largest;
            largest = Integer.MIN_VALUE;

        }
        return last;
    }

    public static void main(String[] args) {
        int[] input = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(findKthLargest(input,k));
    }
}
