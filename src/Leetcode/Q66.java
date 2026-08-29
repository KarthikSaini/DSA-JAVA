package Leetcode;

import java.math.BigInteger;

public class Q66 {

//    Working but need to optimise
//    public static int[] plusOne(int[] digits) {
//        int l = digits.length;
//        if(digits[l-1] >= 0 && digits[l-1] < 9){
//            digits[l-1] = digits[l-1]+1;
//            return digits;
//        }
//
//        int num = 0;
//
//        for(int i : digits){
//            num = num * 10;
//            num = num + i;
//        }
//
//        num++;
//
//        int len = String.valueOf(num).length();
//
//        int[] result = new int[len];
//
//        System.out.println(num);
//
//        int temp = 0;
//
//        for(int i=len-1; i>=0; i--){
//            temp = num % 10;
//            result[i] = temp;
//            num = num / 10;
//            temp = 0;
//        }
//
//        return result;
//    }

    public static int[] plusOne(int[] digits) {
        int l = digits.length;
        if(digits[l-1] >= 0 && digits[l-1] < 9){
            digits[l-1] = digits[l-1]+1;
            return digits;
        }

        int temp = 1;
        int carry = 1;


//        System.out.println(9/10);

        for(int i=l-1; i>=0; i--){
            temp = digits[i] + temp;
            digits[i] = temp % 10;
            temp = temp /10;

        }

        if(temp > 0){
            int[] result = new int[l+1];
            result[0] = temp;
            for (int i=1; i<result.length; i++){
                result[i] = digits[i-1];
            }
            return result;
        }

        return digits;
    }

    public static void main(String[] args) {
        int[] input = {9,9};
        int[] result = plusOne(input);
        for(int i : result){
            System.out.print(i+ "  ");
        }
    }
}
