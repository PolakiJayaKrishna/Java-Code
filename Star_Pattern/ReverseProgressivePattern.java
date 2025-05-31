package Star_Pattern;

import java.util.Scanner;

class  ReverseProgressivePattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int N = sc.nextInt();
        int Start =1;int End;
        for (int i = 1; i <=N; i++) {
            End = Start+i-1;
            for (int j = End; j >=Start; j--) {
                System.out.print(j +" ");
            }
            Start = End+1;
            System.out.println();
        }
    }
}