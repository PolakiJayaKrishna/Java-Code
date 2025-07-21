//Write a Java program that prints all unique pairs in the array {2, 4, 6, 8, 10}. A pair should only be printed once and should not repeat with reversed order (e.g., (2,4) is allowed, but (4,2) is not).

public class UniqueArrayPairs {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        int totalPairs=0;
        for(int i=0;i<arr.length-1;i++){
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + " " + arr[j] + ") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Number of Pairs:" + totalPairs);
    }
}
