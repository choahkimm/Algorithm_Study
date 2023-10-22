package beakjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon1018 {
    // 백준 1018. 체스판 다시 칠하기
    // 완전탐색: 브루트포스 알고리즘

        public static boolean[][] arr;  // 체스판 상태를 저장하는 2차원 배열
        public static int min = 64;  // 최소 칠해야 하는 칸 수를 저장할 변수

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // 1. 보드판 크기
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // 행
            int m = Integer.parseInt(st.nextToken()); // 열

            // 2. 입력된 보드판 데이터를 2차원 배열에 저장
            arr = new boolean[n][m];

            for (int i = 0; i < n; i++) {
                String data = br.readLine();
                for (int j = 0; j < m; j++) {
                    if (data.charAt(j) == 'W') arr[i][j] = true; // 흰색인 경우
                    else arr[i][j] = false;
                }
            }

            int maxN = n-7;
            int maxM= m-7;

            // 3. 보드를 8*8 체스판으로 슬라이딩 하면서 최소 칠해야하는 수 계산
            for(int i =0; i<maxN; i++){
                for (int j=0; j<maxN; j++){
                    find(i,j);
                }
            }
        }

        // 주어진 시작 위치 (x,y)에서 8*8 체스판을 만들 때 최소 칠해야 하는 수 계산
    private static void find(int x, int y) {
            int cnt = 0;
            boolean tf = arr[x][y]; // 시작 위치의 색

        // 8*8 영역을 검사하며 칠해야 하는 칸 수 계산
        for(int i=x; i<x+8; i++){
            for(int j=y; j<y+9; j++){
                if(arr[i][j] != tf) cnt++;

                tf = !tf; // 다음 칸의 색은 반대로
            }
            tf = !tf; // 다음 행에서 시작 색을 반전
        }
        cnt = Math.min(cnt, 64-cnt); //두 경우 중에서 최소값 선택
        min = Math.min(min, cnt); // 현재까지의 최소값과 비교하여 더 작은 값 선택
    }
}
