package String;

import java.util.LinkedHashMap;

public class MostFrequentWordFinder {
    public static void main(String[] args) {
        String sentence = "java is great and java is powerful and java rocks";
        sentence = sentence.toLowerCase();
        LinkedHashMap<String , Integer> map = new LinkedHashMap<>();
        String[] strArr = sentence.split(" ");
        for (String s : strArr) {
            if(map.containsKey(s))
                map.put(s,map.get(s) + 1);
            else
                map.put(s,1);
        }
        int temp=0;
        String word = "";
        for (String string : map.keySet()) {
            if(map.get(string) > temp){
                temp = map.get(string);
                word = string;
            }
        }
        System.out.println(word + ": " + temp);
    }
}
