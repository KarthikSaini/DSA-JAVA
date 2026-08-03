package Hashing;

import java.util.HashMap;
import java.util.Map;

// Count frequency of each element
public class Q2 {

    public static void FreOfEachElement(int[] input){
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i : input){
            hashMap.putIfAbsent(i,0);
            hashMap.put(i,hashMap.get(i)+1);
        }

        for(Map.Entry<Integer,Integer> entryset : hashMap.entrySet()){
            System.out.println(entryset.getKey()+ "  "+ entryset.getValue());
        }
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,2,1};
        FreOfEachElement(input);
//        System.out.println(result);
    }
}
