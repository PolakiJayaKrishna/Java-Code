public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,10,5,6,7,8};
        int largetNumber=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > largetNumber)
                largetNumber = arr[i];
        }
        System.out.println(largetNumber);
    }
}
