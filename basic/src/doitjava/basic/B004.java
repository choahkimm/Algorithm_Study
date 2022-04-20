package doitjava.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B004 {
    // 03-2 구간 합
    // 004.구간 합 구하기2 (백준 온라인 저지 11660)

    // 1단계 - 문제 분석
    //      1차원 -> 2차원 된 것이 포인트 ( D[x][y] )
    // 2단계 - 손으로 풀기
    // 3단계 - 슈도코드
    // 4단계 - 코드 구현

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // N x N 값들 입력
        int A[][] = new int [N+1][N+1];
        for(int i=1; i<=N; i++){
            st=new StringTokenizer(br.readLine());
            for(int j=1; j<N; j++){
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 구간 합
        int D[][] = new int[N+1][N+1];
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                // 구간 합 구하기 !!!
                D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j];
            }
        }

        for(int i=0; i<M; i++){
            st=new StringTokenizer(br.readLine());
            int x1= Integer.parseInt(br.readLine());
            int y1= Integer.parseInt(br.readLine());
            int x2= Integer.parseInt(br.readLine());
            int y2= Integer.parseInt(br.readLine());
            //구간 합 배열로 질의에 답변하기
            int result = D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1];
            System.out.println(result);
        }
    }
}
