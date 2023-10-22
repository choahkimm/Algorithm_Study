import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Beakjoon1018 {
    public static boolean[][] arr;  // 체스판 상태를 저장하는 2차원 배열
    public static int min = 64;  // 최소 칠해야 하는 칸 수를 저장할 변수

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());  // 행 수
        int M = Integer.parseInt(st.nextToken());  // 열 수

        arr = new boolean[N][M];  // 입력된 체스판의 상태를 저장할 2차원 배열

        // 입력된 보드의 상태를 배열에 저장
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true;  // 흰색인 경우 true
                } else {
                    arr[i][j] = false;  // 검은색인 경우 false
                }
            }
        }

        int max_N = N - 7;
        int max_M = M - 7;

        // 가능한 모든 시작 위치에서 8x8 체스판을 만들 때 최소 칠해야 하는 칸 수 계산
        for (int i = 0; i < max_N; i++) {
            for (int j = 0; j < max_M; j++) {
                find(i, j);
            }
        }

        System.out.println(min);  // 최소 칠해야 하는 칸 수 출력
    }

    // 주어진 시작 위치 (x, y)에서 8x8 체스판을 만들 때 최소 칠해야 하는 칸 수 계산
    public static void find(int x, int y) {
        int count = 0;
        boolean TF = arr[x][y];  // 시작 위치의 색

        // 8x8 영역을 검사하며 칠해야 하는 칸 수 계산
        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (arr[i][j] != TF) {
                    count++;
                }
                TF = !TF;  // 다음 칸의 색은 반대로
            }
            TF = !TF;  // 다음 행에서 시작 색을 반전
        }

        count = Math.min(count, 64 - count);  // 두 경우 중에서 최소값 선택
        min = Math.min(min, count);  // 현재까지의 최소값과 비교하여 더 작은 값 선택
    }
}
