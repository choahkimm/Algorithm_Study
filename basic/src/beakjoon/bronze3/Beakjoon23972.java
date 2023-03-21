package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon23972 {
    // 백준 23972. 악마의 제안
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        long x = (long) k * n / (n - 1);

        if (n == 1) { // 무조건 손해
            System.out.println(-1);
        }
        if ((n * k) % (n - 1) != 0) // 정수로 안 나온다면
            x++;
        System.out.println(x);
    }
}

