package Leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Q215 {

    public static int findKthLargest(int[] nums, int k) {

//        Working fine but not optimised
//        int largest = Integer.MIN_VALUE;
//        int index = -1;
//        int last = largest;
//
//        int result = -1;
//        for(int i=0; i<k; i++){
//            for(int j=0; j<nums.length; j++){
//                if(nums[j] > largest){
//                    largest = nums[j];
//                    index = j;
//                }
//            }
//            nums[index] = Integer.MIN_VALUE;
//            last = largest;
//            largest = Integer.MIN_VALUE;
//
//        }
//        return last;


//        Approach 2 and working

//        int[] temp = new int[k];
//
//        for(int i=0; i<k; i++){
//            temp[i] = nums[i];
//        }
//
//        Arrays.sort(temp);
//
//
//        for (int i=k; i<nums.length; i++){
//            if(nums[i] > temp[0]){
//                temp[0] = nums[i];
//                Arrays.sort(temp);
//            }
//        }
//
//        return temp[temp.length - k];




//        Approach 3 and working

//        int[] temp = new int[k];
//
//        for(int i=0; i<k; i++){
//            temp[i] = nums[i];
//        }
//
//        Arrays.sort(temp);
//
//        int smallest = 0;
//        int incremenet = 0;
//
//
//        for (int i=k; i<nums.length; i++){
//            for(int j=temp.length-1; j>=0; j--){
//                if(nums[i] > temp[smallest]){
//                   temp[smallest] = nums[i];
//                    smallest = (smallest + 1) % temp.length;
//                   break;
//                }
//            }
//        }
//
//
//            for (int i : temp){
//                System.out.println(i);
//            }
//        int result = Integer.MAX_VALUE;
//
//            for(int i : temp){
//                if(i<result){
//                    result = i;
//                }
//            }
//        return result;



//        Approach 4
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(int i=0; i<k; i++){
            priorityQueue.add(nums[i]);
        }

        for(int i=k; i<nums.length; i++){
            if(nums[i] > priorityQueue.peek()){
                priorityQueue.poll();
                priorityQueue.add(nums[i]);
            }
        }

        return priorityQueue.peek();
    }

    public static void main(String[] args) {
//        int[] input = {3,2,1,5,6,4};
//        int[] input = {3,2,3,1,2,4,5,5,6};
        int[] input = {3,1,2,4};
        int k = 2;
        System.out.println(findKthLargest(input,2));
    }
}
