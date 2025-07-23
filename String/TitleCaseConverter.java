//Write a function in Java that takes a string as input and returns a new string with the first character of each word converted to uppercase. 

package String;

public class TitleCaseConverter {
    public static void main(String[] args) {
        String string = "hi iam jaya KRIShna";
        titleUpper(string);
    }
    public static void titleUpper(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == ' ' && i<str.length()-1){
                sb.append(ch);
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else
                sb.append(ch);
        }
        System.out.println(sb);
    }
}
