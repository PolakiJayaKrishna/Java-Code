package String;

public class CharacterCounter {
    public static void main(String[] args) {
        String input = "Java123@#!";
        int letter =0 , digit=0 , symbol=0;
        input = input.trim();
        for(char c : input.toCharArray()){
            if(Character.isLetter(c))
                letter++;
            else if(Character.isDigit(c))
                digit++;
            else
                symbol++;
        }
        System.out.println("Letters: " + letter);
        System.out.println("Digits: "  + digit);
        System.out.println("Special Symbols: " + symbol);
    }
}
