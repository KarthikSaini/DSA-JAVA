package Strings;

// Count vowels and consonants
public class Q10 {

    static public void countVowCon(String input){
        int vowels = 0;
        int consonants = 0;
        for(char ch : input.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            } else {
                consonants++;
            }
        }

        System.out.println("vowels are " + vowels);
        System.out.println("consonants are " + consonants);
    }

    public static void main(String[] args) {
        String input = "aiefsfds";
        countVowCon(input);
    }
}
