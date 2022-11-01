package beakjoon.bronze5;

import java.util.Scanner;

public class Beakjoon2475 {
    // 백준 2475. 검증수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
//        int[] arr = new int[5];
//
//        int sum = 0;
//        for(int i=0; i<5; i++){
//            arr[i] = sc.nextInt();
//            arr[i] = arr[i]*arr[i];
//            sum += arr[i];
//        }
//        System.out.println(sum%10);

        // 배열에 담지 않아도 될 문제임
        int sum=0;
        for(int i=0; i<5; i++){
            int temp = sc.nextInt();
            sum += temp * temp;
        }
        System.out.println(sum%10);

    }
}
