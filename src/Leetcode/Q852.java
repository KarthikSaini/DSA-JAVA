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

//    Approach 3 - using binary search
//    static public int peakIndexInMountainArray(int[] arr) {
//        int left = 0;
//        int right = arr.length-1;
//        int max = Integer.MIN_VALUE;
//        int index = -1;
//
//        while(left < right){
//            int mid = (left + right) / 2 ;
//            System.out.println(mid);
//
//            if(arr[mid] > max){
//                max = arr[mid];
//                index = mid;
//            }
//
//            if(arr[mid] < arr[mid+1]){
//                left = mid + 1;
//            } else {
//                right = right - 1;
//            }
//        }
//
//        return index;
//    }

    static public int peakIndexInMountainArray(int[] arr) {
        int left=0;
        int right=arr.length-1;

        while(left<right){
            int mid=(left+right)/2;
            System.out.println(mid);

            if(arr[mid]<arr[mid+1]){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] input = {1, 10, 9, 8, 7, 6, 5, 4, 3, 2};
        System.out.println("Result "+peakIndexInMountainArray(input));
    }
}
