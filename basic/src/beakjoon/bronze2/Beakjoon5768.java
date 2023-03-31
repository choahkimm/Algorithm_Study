package beakjoon.bronze2;

import java.io.*;
import java.util.StringTokenizer;

public class Beakjoon5768 {
    // 백준 5768. Divide and Conquer
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = "";
        while(!"0 0".equals(line = br.readLine())) {
            StringTokenizer st = new StringTokenizer(line);

            // x의 범위 : m <= x <= n
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int x = 0, y = 0;

            for(int i=m; i<=n; i++) { // m~n 범위
                int cnt = 0;

                for(int j=1; j<=i; j++) {
                    if(i % j == 0)
                        cnt++; // 약수의 개수 카운트
                }

                if(cnt >= y) {
                    y = cnt; // y는 x의 약수의 개수
                    x = i; // x는 약수의 총 개수가 가장 큰 수
                }
            }
            bw.write(x + " " + y + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}