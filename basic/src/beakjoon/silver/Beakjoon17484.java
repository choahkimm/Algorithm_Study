package beakjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon17484 {
    // 백준 17484. 진우의 달 여행 (Small)
    // 다이나믹, 브루트포스
    static int N, M; // 행과 열의 크기
    static int[][] arr; // 경비 정보를 저장하는 배열
    static int answer = Integer.MAX_VALUE; // 최소 비용을 저장할 변수
    static int[] ydir = {-1, 0, 1}; // 아래 칸으로 이동할 때의 방향 정보 (-1: 왼쪽, 0: 직진, 1: 오른쪽)
    static int[] visited; // 행마다 방문한 열의 정보를 저장할 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 행의 크기
        M = Integer.parseInt(st.nextToken()); // 열의 크기

        // 경비 정보를 2차원 배열에 저장
        arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 0행의 각 열에서 시작하여 모든 경우를 탐색
        for (int i = 0; i < M; i++) {
            visited = new int[N];
            visited[0] = i;
            dfs(1, i, -1);
        }

        System.out.println(answer);
    }

    // DFS를 이용한 완전 탐색
    // depth: 현재 탐색 깊이, y: 현재 열, dir: 이전에 어느 방향으로 이동했는지 정보
    public static void dfs(int depth, int y, int dir) {
        if (depth == N) {
            // 모든 행을 방문한 경우, 비용을 계산
            int sum = arr[0][visited[0]];
            for (int i = 1; i < N; i++) {
                sum += arr[i][visited[i]];
            }
            answer = sum < answer ? sum : answer; // 현재 비용과 최소 비용을 비교하여 갱신
            return;
        }

        // 이동 가능한 방향을 고려
        for (int i = 0; i < 3; i++) {
            int dy = y + ydir[i];
            if (isValidPosition(dy) && dir != i) {
                visited[depth] = dy;
                dfs(depth + 1, dy, i);
            }
        }
    }

    // 유효한 열 위치인지 확인
    private static boolean isValidPosition(int y) {
        return y >= 0 && y < M;
    }
}
