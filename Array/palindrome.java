

//Check if an array is palindromic (e.g., {1, 2, 3, 2, 1}).

public class palindrome{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        int j=1;
        boolean isPalindromic = true;
        for (int i = 0; i < arr.length/2; i++) {
            if(arr[i] == arr[arr.length-j])
                j++;
            else {
                isPalindromic = false;
                break;
            }
        }
        if(isPalindromic)
            System.out.println("yes");
        else
            System.out.println("No");

    }
}