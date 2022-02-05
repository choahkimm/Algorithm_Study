package inflearn.B_Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Array05 {
    // 05. 소수(에라토스테네스 체)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=2; i<n; i++){
            for(int j=2; j<n; j++){
                if(i%j!=0) arr[i] = i;
                else break;

            }
        }
        for(int x : arr){
            System.out.println(x);
        }
        System.out.println();

        ArrayList<Integer> answer = new ArrayList<>();
        for(int x : arr){
            if(x!=0)
                answer.add(x);
        }
        System.out.println(answer);
        System.out.println(answer.size() +1);
    }
}

/*
5. 소수(에라토스테네스 체)
설명

자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.

만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.


입력
첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.


출력
첫 줄에 소수의 개수를 출력합니다.


예시 입력 1

20
예시 출력 1

8
 */