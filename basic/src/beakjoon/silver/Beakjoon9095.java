package beakjoon.silver;

import java.io.*;

public class Beakjoon9095 {
    // 백준 9095. 1,2,3 더하기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testcase = Integer.parseInt(br.readLine());

        for(int i=0; i<testcase; i++){
            int n = Integer.parseInt(br.readLine());

            //조건 : n<11
            int[] dp= new int[11];

            // 1,2,3 은 동일
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            // n이 4 부터 계산
            for(int k=4; k<=n; k++){
                dp[k] = dp[k-3] + dp[k-2] + dp[k-1];
            }
            bw.write(dp[n] + "\n");
        }
        bw.flush();

        // DP(동적프로그래밍) 알고리즘 ,점화식
        // 1 = 1  [1]
        // 2 = 2, 1+1   [2]
        // 3 = 3, 2+1, 1+1+1 => 2 [4]
        // 4 = 3+1 =>2, 2+2, 1+1+2 =>3, 1+1+1+1 [7]
        // 5 = 3+2 =>2, 3+1+1 =>3, 2+2+1 =>3, 2+1+1+1 =>4 ,1+1+1+1+1 [13]

        // a[n] = a[n-3] + a[n-2] + a[a-1]
    }
}
