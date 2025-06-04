package Array;

public class MostFrequentLargestElement {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 4, 3, 3, 2, 4, 4 };
        int length = arr.length;
        boolean[] bool = new boolean[length];
        int temp = 0;
        int ind = arr[0];
        for (int i = 0; i < length; i++) {
            int count = 0;
            if (!bool[i]) {
                for (int j = 0; j < length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        bool[j] = true;
                    }
                }
                
                System.out.println(arr[i] + " comes " + count + " times");
                if (count > temp || (count == temp && arr[i] > ind)) {
                    temp = count;
                    ind = arr[i];
                }
            }

        }
        System.out.println("---------------------------------");
        System.out.println(ind + " is Bigger and repeted " + temp + " times");
    }
}