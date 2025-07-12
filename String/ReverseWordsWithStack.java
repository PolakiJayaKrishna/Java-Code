package String;

public class ReverseWordsWithStack {
    public static void main(String[] args) {
        String input = "Java is super powerful";
        String[] arr = input.split(" ");
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}
