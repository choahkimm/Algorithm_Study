package beakjoon.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon20155 {
    // 백준 20155. 우리 집 밑에 편의점이 있는데
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 편의점 개수
        int M = Integer.parseInt(st.nextToken()); // 브랜드 개수

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] count = new int[M + 1]; // 각 브랜드별 편의점 개수를 저장할 배열

        // 편의점 개수 카운트
        for (int i = 0; i < N; i++) {
            count[arr[i]]++;
        }

        int maxCount = 0;
        for (int i = 0; i <= M; i++) {
            maxCount = Math.max(maxCount, count[i]);
        }

        System.out.println(maxCount);
    }
}
