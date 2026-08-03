package Hashing;

import java.util.*;

// Find pairs with given sum
public class Q3 {

    public static List<List<Integer>> pairsWithSum(int[] input, int target){

        // Solution one
//        List<List<Integer>> result = new ArrayList<>();
//        List<Integer> check = new ArrayList<>();
//
//        HashSet<Integer> hashSet = new HashSet<>();
//        for(int i : input){
//            hashSet.add(i);
//            check.add(i);
//        }
//
//        for (Integer num : check){
//            int temp = target - num;
//            boolean find = hashSet.contains(temp);
//            if(find){
//                List<Integer> tempList = new ArrayList<>();
//                tempList.add(num);
//                tempList.add(temp);
//                result.add(tempList);
//                hashSet.remove(num);
//                hashSet.remove(temp);
//            }
//        }
//
//        return result;

        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i : input){
            hashMap.putIfAbsent(i,0);
            if(hashMap.containsKey(i)){
                hashMap.put(i,hashMap.get(i)+1);
            }
        }

//        for (Map.Entry<Integer, Integer> entryset : hashMap.entrySet()){
//            int temp = target - entryset.getKey();
//            boolean find = hashMap.containsKey(temp);
//            if(find){
//                List<Integer> tempList = new ArrayList<>();
//                tempList.add(num);
//                tempList.add(temp);
//                result.add(tempList);
//                hashMap.remove(num);
//                hashMap.remove(temp);
//            }
//        }

        if(hashMap.containsKey(target/2) && hashMap.get(target/2)<2){
            hashMap.remove(target/2);
        }

        for (int num : input){
            int temp = target - num;
            boolean find = hashMap.containsKey(temp);
            if(find){
                List<Integer> tempList = new ArrayList<>();
                tempList.add(num);
                tempList.add(temp);
                result.add(tempList);
                hashMap.remove(num);
                hashMap.remove(temp);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {1, 5, 3, 4, 2, 3};
        int target = 6;
        List<List<Integer>> result = pairsWithSum(input, target);

        for(List<Integer> list : result){
            System.out.println(list);
        }
    }
}
