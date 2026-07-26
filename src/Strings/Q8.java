package Strings;

// String compression (aabbb -> a2b3)
public class Q8 {

    public static String compressionString(String input){

        int[] check = new int[26];

        for(int i=0;i<input.length(); i++){
            check[input.charAt(i) - 'a']++;
        }

        StringBuffer result = new StringBuffer();

        for(int i=0; i<input.length(); i++){
            if(check[i]>0){
                char ch = (char) (i + 'a');
                int count = check[i];

                result.append(ch);
                result.append(count);
            }
        }
        return new String(result);
    }

    public static void main(String[] args) {
        String input = "aabbb";
        String result = compressionString(input);
        System.out.println(result);
    }
}
