package Strings;

// Longest common prefix
public class Q6 {

    public static String lonComPrefix(String[] input){

        if(input.length == 0){
            return null;
        }
        StringBuilder result = new StringBuilder();

        char temp = ' ';

        int sl = Integer.MAX_VALUE;
        for(String s : input){
            if(s.length()<sl){
                sl = s.length();
            }
        }

        for(int i=0; i<sl; i++){
            temp = input[0].charAt(i);
            for(int j=0; j<input.length; j++){
                if(temp != input[j].charAt(i)){
                    return new String(result);
                }
            }
            result.append(temp);
        }

        return new String(result);
    }

    public static void main(String[] args) {

        String[] input = {"flower","flow","flight"};
//        String[] input = {"dog","racecar","car"};
//        String[] input = {"ab", "a"};
        String result = lonComPrefix(input);
        System.out.println(result);
    }

}
