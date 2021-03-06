package inflearn.C_TowPointers_SlidingWindow;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {
        //5. 연속된 자연수의 합
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // lt rt
        // 1  2  3 4 5 6 7 8 9 10 11 12 13 14 15

        // 풀이 - two pointer?
        int pl=1, pr=2, sum=pl, answer=0;
        while (pr<n){
            sum += pr;
            if(sum==n){
                answer++;
            }
            else {
                while (sum>=n){
                    sum -= pl;
                    pl++;
                    if(sum==n) answer++;
                }
            }
            pr++;

        }
        System.out.println(answer);
        // 풀이 - sliding window? - 윈도우 크기 2개일때, 3개일 때, 4개일때...n개..? 떼잉.

    }
}
/*
5. 연속된 자연수의 합

설명

N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.

만약 N=15이면

7+8=15

4+5+6=15

1+2+3+4+5=15

와 같이 총 3가지의 경우가 존재한다.


입력
첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.


출력
첫 줄에 총 경우수를 출력합니다.


예시 입력 1

15
예시 출력 1

3
 */