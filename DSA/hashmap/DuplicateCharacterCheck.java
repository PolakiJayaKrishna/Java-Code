package DSA.hashmap;


import java.util.HashMap;

public class DuplicateCharacterCheck {
    public static void main(String[] args) {
        HashMap<String , Integer> hmap = new HashMap<>();
        String charater = "developer";
        String[] strarr = charater.split("");
        for (String key : strarr) {
            if(hmap.containsKey(key))
                hmap.put(key , hmap.get(key) +1);
            else
                hmap.put(key,1);
        }
        for (String key : hmap.keySet()) {
            System.out.println(key + " -> " + hmap.get(key) + " times");
        }
    }
}
