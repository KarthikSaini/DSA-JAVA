package Strings;

// Check if string is palindrome
public class Q2 {

    public static boolean ispalindrome(String input){
        if(input.isEmpty()){
            return true;
        }

        char[] charInput = input.toCharArray();
        int l = charInput.length;

        for(int i=0; i<l/2; i++){
            if(charInput[i] != charInput[l-i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "leael";
        boolean result = ispalindrome(input);
        System.out.println(result);
    }
}
