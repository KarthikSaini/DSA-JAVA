package Strings;

import java.util.HashMap;
import java.util.Map;

// Check anagrams
public class Q3 {

    public static boolean isAnagrams(String input1, String input2){

        if(input1.isEmpty() && input2.isEmpty()){
            return true;
        }

        if(input1.isEmpty() || input2.isEmpty()){
            return false;
        }

        if(input1.length() != input2.length()){
            return false;
        }

        HashMap<Character, Integer> hashMap = new HashMap<>();

        char[] charInput1 = input1.toCharArray();
        char[] charInput2 = input2.toCharArray();
        int l = charInput1.length;

        for(char i : charInput1){
            if(hashMap.containsKey(i)){
                hashMap.put(i,hashMap.get(i)+1);
            } else {
                hashMap.put(i,1);
            }
        }

        for(char i : charInput2){
            if(hashMap.containsKey(i)){
                if(hashMap.get(i)>0){
                    System.out.println(hashMap.get(i));
                    hashMap.put(i,hashMap.get(i)-1);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input1 = "listen";
        String input2 = "silenz";
        boolean result = isAnagrams(input1, input2);
        System.out.println(result);
    }
}
