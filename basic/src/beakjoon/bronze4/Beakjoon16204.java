package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon16204 {
    // 백준 16204. 카드 뽑기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int BO = N-M;
        int BX = N-K;
        int sum =0;

        sum = Math.min(M,K);
        sum += Math.min(BO,BX);
        System.out.println((sum));
        br.close();
    }
}
