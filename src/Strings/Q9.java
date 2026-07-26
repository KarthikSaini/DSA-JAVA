package Strings;

import java.util.HashMap;
import java.util.Stack;

// Valid parentheses
public class Q9 {

    static public boolean isValid(String s) {

        if(s.isEmpty()){
            return true;
        }

        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');

        Stack<Character> check = new Stack<>();

        for(char i : s.toCharArray()){
            if(i == '(' || i == '[' || i == '{'){
                check.push(i);
            } else {

                if(check.isEmpty()){
                    return false;
                }

                char ch = check.pop();
                System.out.println(ch+ " "+ brackets.get(i));
                if(ch != brackets.get(i)){
                    return false;
                }

            }
        }

        return check.isEmpty();
    }

    public static void main(String[] args) {
        String input = "()[]{}";
//        String input = "[[[[";
        boolean result = isValid(input);
        System.out.println(result);

    }

    }
