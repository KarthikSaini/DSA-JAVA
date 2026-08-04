package Hashing;

import java.util.*;

// Top K frequent elements
public class Q6 {

    public static int[] topKFrequent(int[] nums, int k) {

        if(nums.length == 0){
            return new int[0];
        }

        // Took help from chatgpt about sorting of hashmap
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i : nums){
            hashMap.putIfAbsent(i,0);
            hashMap.put(i,hashMap.get(i)+1);
        }

        System.out.println(hashMap);

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hashMap.entrySet());

        list.sort((a,b) -> b.getValue() - a.getValue());

        int[] result = new int[k];

        for(int i=0; i<k; i++){
            result[i] = list.get(i).getKey();
        }

//        List<Integer> list = new ArrayList<>();
//
//        for (Map.Entry<Integer, Integer> entryset : hashMap.entrySet()){
//            list.add(entryset.getValue());
//        }
//
//        list.sort(Comparator.reverseOrder());
//
//        System.out.println(list);
//
//        int[] result = new int[k];
//
//        for(int i=0; i<k; i++){
//            result[i] = hashMap.k(list.get(i));
//        }

        return result;
    }

    public static void main(String[] args) {
//        int[] input = {1,1,1,2,2,3};
        int[] input = {1};
        int k = 1;
        int[] result = topKFrequent(input,k);
        System.out.println(result[0]);
    }


}
