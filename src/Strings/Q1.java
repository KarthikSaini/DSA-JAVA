package Strings;

// Reverse a string
public class Q1 {

    public static String reverseString(String input){
        if(input.isEmpty()){
            return "";
        }

        char[] charInput = input.toCharArray();
        int l = charInput.length;

        char temp = ' ';
        for(int i=0; i<l/2; i++){
            temp = charInput[i];
            charInput[i] = charInput[l-i-1];
            charInput[l-i-1] = temp;
        }
        return new String(charInput);
    }

    public static void main(String[] args) {
        String input = "ReverseArray";
        String result = reverseString(input);
        System.out.println(result);
    }
}
