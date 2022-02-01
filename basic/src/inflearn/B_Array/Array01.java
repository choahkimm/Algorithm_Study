package inflearn.B_Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array01 {
    // 1. 큰 수 출력하기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // 입력받은 숫자를 배열에 저장
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // 배열을 뽑아서 숫자 비교
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]); // 첫번째 숫자는 무조건 저장
        for(int i=1; i<n; i++){ // 그럼 index 1부터 시작
            if(arr[i] > arr[i-1]){
                answer.add(arr[i]);
            }
        }

        for(int x: answer){
            System.out.print(x +" ");
        }
    }
}
/*
1. 큰 수 출력하기
설명

N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.

(첫 번째 수는 무조건 출력한다)


입력
첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.


출력
자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.


예시 입력 1

6
7 3 9 5 6 12
예시 출력 1

7 9 6 12
 */