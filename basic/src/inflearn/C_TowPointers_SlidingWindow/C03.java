package inflearn.C_TowPointers_SlidingWindow;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        //3. 최대 매출 (sliding window)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // 연속된 3일간의 매출 중 가장 큰 매출액 구하기
        // for문으로 풀어보기 - i부터 k까지 매출액 ----->>>> Runtime Error
        // 역시나 Sliding window로 풀어야함
        int answer=0;
        for(int i=0; i<n-k; i++){
            int sum=0;
            for(int j=i; j<i+k; j++ ){
                sum += arr[j];
            }
            if(sum > answer){
                answer=sum;
            }
        }
        System.out.println(answer);
    }
}

/*
3. 최대 매출
설명

현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.

만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면

12 15 11 20 25 10 20 19 13 15

연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.

여러분이 현수를 도와주세요.


입력
첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.

두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.


출력
첫 줄에 최대 매출액을 출력합니다.


예시 입력 1

10 3
12 15 11 20 25 10 20 19 13 15
예시 출력 1

56
 */
