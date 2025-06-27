//Write a program that takes a sentence and prints how many times each word appears using

package DSA.hashmap;
import java.util.HashMap;
public class WordFrequencyCounter{
    public static void main(String[] args) {
        HashMap<String , Integer> hmap = new HashMap<>();
        String sentence = "Java is Good to Learn and Java is Easy";
        String[] arr = sentence.split(" ");
        for(String key : arr){
            if(hmap.containsKey(key))
                hmap.put(key,hmap.get(key) + 1);
            else
                hmap.put(key,1);
        }
        for(String key : hmap.keySet()){
            System.out.println(key + ": " + hmap.get(key));
        }
    }
}