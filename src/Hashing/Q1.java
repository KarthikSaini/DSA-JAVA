package Hashing;

import java.util.HashSet;

// First repeating element
public class Q1 {

    public static int FirstRepeatingElement(int[] input){
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i : input){
            if(!hashSet.add(i)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,2,1};
        int result = FirstRepeatingElement(input);
        System.out.println(result);
    }
}
