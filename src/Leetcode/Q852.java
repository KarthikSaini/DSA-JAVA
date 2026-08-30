package Leetcode;

public class Q852 {

//    Approach 1
//    static public int peakIndexInMountainArray(int[] arr) {
//        int max = Integer.MIN_VALUE;
//        int index = -1;
//
//        for(int i=0; i<arr.length; i++){
//            if (arr[i] > max){
//                max = arr[i];
//                index = i;
//            }
//        }
//        return index;
//    }

//    Approach 2
//    static public int peakIndexInMountainArray(int[] arr) {
//        int max = Integer.MIN_VALUE;
//        int index = -1;
//
//        for(int i=0; i<arr.length; i++){
//            if (arr[i] > max){
//                max = arr[i];
//                index = i;
//
//                if(arr[i] < max){
//                    break;
//                }
//            }
//        }
//        return index;
//    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 10, 9, 7, 4, 2};
        System.out.println(peakIndexInMountainArray(input));
    }
}
