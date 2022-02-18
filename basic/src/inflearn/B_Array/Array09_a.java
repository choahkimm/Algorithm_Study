package inflearn.B_Array;

import java.util.Scanner;

public class Array09_a {
    public static int solution(int n, int[][] arr){
        int answer=-2147000000; //MIN_VALUE
        int sum1=0, sum2=0;

        // 행 합, 열 합
        for(int i=0; i<n; i++){
            sum1=sum2=0;
            for(int j=0; j<n; j++){
                sum1+=arr[i][j];
                sum2+=arr[j][i];
            }
            answer=Math.max(answer, sum1);
            answer=Math.max(answer, sum2);

            //Math.Max 메서드 : 두 변수 중 더 큰 값을 반환
        }

        // 우하향 대각선 합, 우상향 대각선 합
        sum1=sum2=0;
        for(int i=0; i<n; i++){
            sum1+=arr[i][i];
            sum2+=arr[i][n-i-1];
        }
        answer=Math.max(answer, sum1);
        answer=Math.max(answer, sum2);
        return answer;
    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.print(solution(n, arr));
    }
}

