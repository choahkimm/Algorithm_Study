package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2441 {
    // 백준 2441. 별 찍기 4
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i=n; i >= 1; i--) {
            for (int j=0; j < n-i; j++) {
                sb.append(" ");  //공백 출력
            }
            for (int j=1; j <= i; j++) {
                sb.append("*");  //별 출력
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
