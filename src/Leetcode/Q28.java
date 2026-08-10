package Leetcode;

public class Q28 {

    public static int strStr(String haystack, String needle) {

        int result = -1;
        if(haystack==null || needle==null){
            return result;
        }

        if(haystack.equals(needle)){
            return 0;
        }

        boolean found = false;


        for(int i=0;i<=haystack.length()-needle.length(); i++){
//            System.out.println(haystack.substring(i,needle.length()+i));
            if(haystack.substring(i,needle.length()+i).equals(needle)){
//                System.out.println(haystack.substring(i,needle.length()-1));
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack,needle));
    }

}
