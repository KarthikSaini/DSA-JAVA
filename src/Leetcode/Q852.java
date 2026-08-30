package Leetcode;

public class Q852 {

    static public int peakIndexInMountainArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int index = -1;

        for(int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] input = {0,10,5,2};
        System.out.println(peakIndexInMountainArray(input));
    }
}
