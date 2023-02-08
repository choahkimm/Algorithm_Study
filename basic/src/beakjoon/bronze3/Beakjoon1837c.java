package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Beakjoon1837c {
    // 백준 1837. 암호제작
    // 두 소수 p, q의 곱 P를 비밀 키로 두었을 때
    // p, q 중 하나라도 K(2~10^6) 보다 작다면 BAD와 암호를 이루는 가장 작은 수 출력.
    // 아니라면 GOOD 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger P = new BigInteger(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String result = "GOOD";

        for (int i = 2; i < k; i++) {  // 소수는 0,1 제외
            //  10^100자리인 P가 K보다 작은 수로 나눠진다면 해당되는 수를 BAD와 함께 출력
            if (P.remainder(BigInteger.valueOf(i)).compareTo(BigInteger.valueOf(0)) == 0) {
                result = "BAD " + i;
                break;
            }
        }
        System.out.println(result);
    }
}
