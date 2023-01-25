package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2921 {
    // 백준 2921. 도미노
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i <= n; i++) {	// 윗줄은 0부터 n까지
            for (int j = i; j <= n; j++) {	// 아랫줄은 i부터 n까지
                sum += i;
                sum += j;
            }
        }

        System.out.println(sum);
    }
}
