package Strings;

import java.util.*;

// Group Anagrams
public class Q12 {

//    public static List<List<String>> groupAnagrams(String[] strs) {
//
//        HashMap<Integer, List<String>> hashMap = new HashMap<>();
//        for(int i=0; i<strs.length; i++){
//
//            int temp = 0;
//            for(int j=0;j<strs[i].length();j++){
//                temp = temp + strs[i].charAt(j) + 'a';
//            }
//
//            if(hashMap.containsKey(temp)){
//                hashMap.get(temp).add(strs[i]);
//            } else {
//                List<String> templist = new ArrayList<>();
//                templist.add(strs[i]);
//                hashMap.put(temp, templist);
//            }
//        }
//
//        List<List<String>> result = new ArrayList<>();
//
//        for (Map.Entry<Integer,List<String>> entry : hashMap.entrySet()){
//            result.add(entry.getValue());
//        }
//
//
//        return result;
//    }

//    public static boolean isAnagram(String input1, String input2){
//        if(input1.isEmpty() && input2.isEmpty()){
//            return true;
//        }
//
//        if(input1.isEmpty() || input2.isEmpty()){
//            return false;
//        }
//
//        if(input1.length() != input2.length()){
//            return false;
//        }
//
//        char[] charInput1 = input1.toCharArray();
//        char[] charInput2 = input2.toCharArray();
//        int[] check = new int[26];
//
//        int l = charInput1.length;
//
//        for(char i : charInput1){
//            check[i-'a']++;
//        }
//
//        for(char i : charInput2){
//            check[i-'a']--;
//        }
//
//        for(int i=0; i<check.length; i++){
//            if(check[i]!=0){
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    public static List<List<String>> groupAnagrams(String[] strs) {
//
//        List<List<String>> result = new ArrayList<>();
//
//
//        for(int i=0; i<strs.length; i++){
//
//            boolean matched = false;
//
//            for(int j=0; j<result.size(); j++){
//                if(result.isEmpty()){
//                    break;
//                }
//                if(isAnagram(strs[i],result.get(j).get(0))){
//                    result.get(j).add(strs[i]);
//
//                    matched = true;
//                }
//            }
//
//            if(!matched){
//                List<String> temp = new ArrayList<>();
//                temp.add(strs[i]);
//                result.add(temp);
//            }
//        }
//
//
//        return result;
//    }

//    Optimised Approach from leetcode

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for( String str : strs ){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            hashMap.putIfAbsent(key, new ArrayList<>());
            hashMap.get(key).add(str);
        }
        return new ArrayList<>(hashMap.values());
    }

        public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
//        String[] strs = {"eat","tea"};
//        String[] strs = {"cab","tin","pew","duh","may","ill","buy","bar","max","doc"};
        List<List<String>> result = groupAnagrams(strs);
        for (List<String> i : result){
            System.out.println(i);
        }
    }
}
