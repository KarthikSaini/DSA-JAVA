package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Subarray with sum 0
public class Q4 {

    public static List<Integer> subarrayWith0(int[] input){
        List<Integer> result = new ArrayList<>();

        int matchedFrom = 0;
        int matchedOn = 0;
        int previous = 0;

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i=0; i<input.length; i++){
            previous = previous + input[i];
            if(hashMap.containsKey(previous)){
                matchedFrom = hashMap.get(previous);
                matchedOn = i;
                break;
            }
            hashMap.putIfAbsent(previous, i);
        }

//        for(Map.Entry<Integer, Integer> entryset : hashMap.entrySet()){
//            System.out.println(entryset.getKey()+"  "+entryset.getValue()+ "   Map value");
//        }

        System.out.println(matchedFrom+"   "+matchedOn+"  matched");

        for(int i=matchedFrom+1; i<=matchedOn; i++){
            result.add(input[i]);
        }

        return result;
    }

    public static void main(String[] args) {
//        int[] input = {4, 2, -3, 1, 6};
        int[] input = {5,3,2,-1,-4,6,3};

        List<Integer> result = subarrayWith0(input);
        System.out.println(result);

    }
}
