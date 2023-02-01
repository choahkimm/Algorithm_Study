package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Beakjoon2547 {
    // 백준 2547. 사탕 선생 고창영
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            br.readLine();
            int n = Integer.parseInt(br.readLine());

            // BigInteger를 사용했어야 하는 문제 - 안 그러면 Runtime Error
            BigInteger sum = new BigInteger("0");
            for(int j=0; j<n; j++){
                sum = sum.add(BigInteger.valueOf(Long.parseLong(br.readLine())));
            }
            System.out.println((String.valueOf(sum.remainder(BigInteger.valueOf(n))).equals("0"))? "YES":"NO");
        }
    }
}
