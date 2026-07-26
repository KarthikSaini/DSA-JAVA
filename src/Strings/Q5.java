package Strings;

// First non-repeating character
public class Q5 {

    public static char firstNonRepeatChar(String input){

        int[] check = new int[26];

        for(char s : input.toCharArray()){
            check[s-'a']++;
        }

        for(int i=0; i<input.length(); i++){
            if(check[input.charAt(i)-'a'] == 1){
//                char ch = (char) ((char) i + 'a');;
                return input.charAt(i);
            }
        }

        return ' ';
    }

    public static void main(String[] args) {
        String input = "aabccdbe";
        char result = firstNonRepeatChar(input);
        System.out.println(result);
    }

}
