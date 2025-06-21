package String;

public class Count {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("MasTer");
        StringBuilder lower = new StringBuilder();
        StringBuilder upper = new StringBuilder();
        int lowerCount = 0;
        int upperCount = 0;
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upper.append(ch);
                upperCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                lower.append(ch);
                lowerCount++;
            } else
                System.out.println(ch + " is Invalid");
        }
        System.out.print("These are the Lower Letters: ");
        for (int i = 0; i < lower.length(); i++) {
            System.out.print(lower.charAt(i) + " ");
        }
        System.out.println();
        System.out.println("Count is " + lowerCount);
        System.out.println();
        System.out.print("These are the Upper Letters: ");
        for (int i = 0; i < upper.length(); i++) {
            System.out.print(upper.charAt(i) + " ");
        }
        System.out.println();
        System.out.print("Count is " + upperCount);
    }
}
