package doitjava.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class B005 {
    // 03-2 구간 합
    // 005.나머지 합 구하기 (백준 온라인 저지 10986)

    // 1단계 - 문제 분석
        // 구간 합 배열 이용
    // 2단계 - 손으로 풀기
        // 1) A 배열의 합 S 생성
        // 2) 합 배열 S의 모든 값을 M으로 나머지 연산을 수행해 값 업데이트
        // 3) 변경된 합 배열에서 원소 값이 0인 개수만 세어 정답에 더한다
        // 4) 변경된 합 배열에서 원소 값이 같은 2개의 원소를 뽑는 모든 경우의 수를 구하여 정답에 더하기
    // 3단계 - 슈도코드
    // 4단계 - 코드 구현

    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
    }
    /*
    문제
수 N개 A1, A2, ..., AN이 주어진다. 이때, 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 구하는 프로그램을 작성하시오.

즉, Ai + ... + Aj (i ≤ j) 의 합이 M으로 나누어 떨어지는 (i, j) 쌍의 개수를 구해야 한다.

입력
첫째 줄에 N과 M이 주어진다. (1 ≤ N ≤ 106, 2 ≤ M ≤ 103)

둘째 줄에 N개의 수 A1, A2, ..., AN이 주어진다. (0 ≤ Ai ≤ 109)

출력
첫째 줄에 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 출력한다.


    [예제입력]
    5 3
    1 2 3 1 2

    [예제출력] 7
     */


}
