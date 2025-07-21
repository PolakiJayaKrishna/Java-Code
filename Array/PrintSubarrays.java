//Write a Java program to print all subarrays of the array {2, 4, 6, 8, 10}.
//Note: A subarray is a continuous part of the array, so print every possible sequence of contiguous elements.
public class PrintSubarrays {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        subArray(arr);
    }
    public static void subArray(int[] arr){
        for(int i=0;i<arr.length;i++){              //i->Start
            for(int j=i;j<arr.length;j++){          //j->End
                for(int k=i;k<=j;k++){              //Prints SubArray
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}