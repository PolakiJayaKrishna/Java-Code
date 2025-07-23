//Given a string, implement a function to perform basic string compression using the counts of repeated characters.

package String;

public class StringCompression {
    public static void main(String[] args) {
        String string = "aaabbcccd";
        countString(string);
    }

    public static void countString(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                sb.append(str.charAt(i - 1));
                if (count > 1) {
                    sb.append(count);
                }
                count = 1;
            }
        }
        // Append the last character(s)
        sb.append(str.charAt(str.length() - 1));
        if (count > 1) {
            sb.append(count);
        }
        System.out.println(sb);
    }
}
