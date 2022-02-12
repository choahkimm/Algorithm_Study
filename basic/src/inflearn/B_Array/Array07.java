package inflearn.B_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array07 {
    public static int[] solution(int n, int[] arr){
        int[] answer = new int[n];
        answer[0] = arr[0];

        int score =0;
        for(int i=1; i<n; i++){
            if(arr[i]== 1){ // 맞은 경우
                    score += 1;
                if(arr[i-1]==1){
                    score +=1;
                }
            }
            answer[i] = score;

            score=0;
        }

        System.out.println(score);

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(solution(n, arr)));
    }
}

/*
7. 점수계산
설명

OX 문제는 맞거나 틀린 두 경우의 답을 가지는 문제를 말한다.

여러 개의 OX 문제로 만들어진 시험에서 연속적으로 답을 맞히는 경우에는 가산점을 주기 위해서 다음과 같이 점수 계산을 하기로 하였다.

1번 문제가 맞는 경우에는 1점으로 계산한다. 앞의 문제에 대해서는 답을 틀리다가 답이 맞는 처음 문제는 1점으로 계산한다.

또한, 연속으로 문제의 답이 맞는 경우에서 두 번째 문제는 2점, 세 번째 문제는 3점, ..., K번째 문제는 K점으로 계산한다. 틀린 문제는 0점으로 계산한다.

예를 들어, 아래와 같이 10 개의 OX 문제에서 답이 맞은 문제의 경우에는 1로 표시하고, 틀린 경우에는 0으로 표시하였을 때,

점수 계산은 아래 표와 같이 계산되어, 총 점수는 1+1+2+3+1+2=10 점이다.

Image1.jpg

시험문제의 채점 결과가 주어졌을 때, 총 점수를 계산하는 프로그램을 작성하시오.


입력
첫째 줄에 문제의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 N개 문제의 채점 결과를 나타내는 0 혹은 1이 빈 칸을 사이에 두고 주어진다.

0은 문제의 답이 틀린 경우이고, 1은 문제의 답이 맞는 경우이다.


출력
첫째 줄에 입력에서 주어진 채점 결과에 대하여 가산점을 고려한 총 점수를 출력한다.


예시 입력 1

10
1 0 1 1 1 0 0 1 1 0
예시 출력 1

10
 */