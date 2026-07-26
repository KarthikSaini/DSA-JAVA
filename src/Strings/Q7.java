package Strings;

import java.util.HashMap;

// Roman to Integer
public class Q7 {

    public static int romanToInt(String input){

        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        if(input.isBlank()){
            return 0;
        }

        if(input.length() == 1){
            return roman.get(input.charAt(0));
        }

        int result = 0;
        for(int i=0;i<input.length()-1; i++){
            int curr = roman.get(input.charAt(i));
            int next = roman.get(input.charAt(i+1));
            if( curr < next){
                result = result + next - curr;
                i++;
            } else {
                result = result + curr;
            }
        }

        if(roman.get(input.charAt(input.length()-2)) >= roman.get(input.charAt(input.length()-1))){
            result = result + roman.get(input.charAt(input.length()-1));
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "D";
        int result = romanToInt(input);
        System.out.println(result);
    }
}
