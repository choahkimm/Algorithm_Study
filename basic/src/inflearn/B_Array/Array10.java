package inflearn.B_Array;

import java.util.Scanner;

public class Array10 {
    // 10. 봉우리 찾기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    /*
    00 01 02 03 04
    10 11 12 13 14
    20 21 22 23 24
    30 31 32 33 34
    40 41 42 43 44

    index 1~3, 1~3 부분을 구하면 되는데 위 아래 왼쪽 오른쪽 좌표 구하자
    11 12 13
    21 22 23
    31 32 33

    n-2 = 3 까지고
    [i-1, j]
    [i+1, j]
    [i, j-1]
    [i, j+1]

     */

        int[][] square = new int[n][n];

        //  입력한 내용을 정사각혐의 배열에 추가
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                square[i][j] = sc.nextInt();
            }
        }


        int answer=0;
        for(int i=1; i<n-2; i++){
            for(int j=1; j<n-2; j++){
                if((square[i][j]>square[i-1][j]) ||
                        (square[i][j]>square[i+1][j]) ||
                        (square[i][j]>square[i][j-1]) ||
                        (square[i][j]>square[i][j+1])
                ) answer++;
            }
        }
        System.out.println(answer);

    }
}


/*
[10. 봉우리 찾기]

설명

지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.

각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.

격자의 가장자리는 0으로 초기화 되었다고 가정한다.

만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.


입력

첫 줄에 자연수 N이 주어진다.(2<=N<=50)

두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.



출력

봉우리의 개수를 출력하세요.



예시 입력 1

5

5 3 7 2 3

3 7 1 6 1

7 2 5 3 4

4 3 6 4 1

8 7 3 5 2



예시 출력 1

10


 */