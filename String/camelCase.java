package String;

public class camelCase {
    public static void main(String[] args) {
        String sentence = "java is super powerful";
        String[] words  = sentence.split(" ");

        StringBuilder camelCase = new StringBuilder();

        for(int i=0;i<words.length;i++){
            String word = words[i].toLowerCase();

            if(i==0)
                camelCase.append(word);
            else
                camelCase.append(word.substring(0,1).toUpperCase()).append(word.substring(1));
        }
        System.out.println(camelCase);
    }
}
