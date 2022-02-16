package inflearn.B_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array09 {
    //9. 격자판 최대합
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 5
    /*
    00 01 02 03 04
    10 11 12 13 14
    20 21 22 23 24
    30 31 32 33 34
    40 41 42 43 44
     */
        ArrayList<Integer> answer = new ArrayList();
        int[][] square = new int[n][n];

        //  입력한 내용을 정사각혐의 배열에 추가
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                square[i][j] = sc.nextInt();
            }
        }
        int rowSum = 0;
        // 배열의 값들을 더해주기
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(square[i][j] + "\t");
                rowSum = square[i][j];
                System.out.println(rowSum);
                answer.add(rowSum);
            }
        }


    // 행의 합 5개
    // 열의 합 5개
    // 우하향 대각선 합 1개
    // 우상향 대각선 합 1개
    }
}

/*
9. 격자판 최대합
설명

5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.

Image1.jpg

N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.


입력
첫 줄에 자연수 N이 주어진다.(2<=N<=50)

두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.


출력
최대합을 출력합니다.


예시 입력 1

5
10 13 10 12 15
12 39 30 23 11
11 25 50 53 15
19 27 29 37 27
19 13 30 13 19
예시 출력 1

155
 */