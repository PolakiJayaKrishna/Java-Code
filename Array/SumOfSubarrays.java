    //Write a Java program to calculate and print the sum of all possible contiguous subarrays of the array {2, 4, 6, 8, 10}.
    //Each subarray's sum should be printed on a separate line.
    public class SumOfSubarrays {
        public static void main(String[] args) {
            int[] arr = {2,4,6,8,10};
            sum(arr);
        }
        public static void sum(int[] arr){
            int sum=0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                for(int j=i;j<arr.length;j++){
                    sum = 0;
                    for(int k=i;k<=j;k++){
                        sum+= arr[k];
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                    System.out.println("Sum is: " + sum);
                    if(min > sum)
                        min = sum;
                    if(max < sum)
                        max = sum;
                    System.out.println();
                }
                
                System.out.println();
            }
            System.out.println("Minimum Sum of SubArray is: " + min);
            System.out.println("Maximum Sum of SubArray is: " + max);
        }
    }