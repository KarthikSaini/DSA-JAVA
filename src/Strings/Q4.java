package Strings;

// Remove duplicates from string
public class Q4 {

    public static String removeDuplicate(String input){

        StringBuilder result = new StringBuilder();

        int[] check = new int[26];

        for(char i : input.toCharArray()){
            check[i-'a'] = 1;
        }

        for (int i=0; i<check.length; i++){
            if(check[i]>0) {
                char ch = (char) ((char) i + 'a');
                result.append(ch);
            }
        }

        return new String(result);
    }

    public static void main(String[] args) {
        String input = "leael";
        String result = removeDuplicate(input);
        System.out.println(result);
    }
}
