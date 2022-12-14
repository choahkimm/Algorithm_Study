package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Beakjoon5893 {
    // 백준 5893. 17배
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 핵심! 무한정수로 BigInteger 사용해야 함 - long으로도 담을 수 없는 큰 수가 들어올 수 있기에..
        // BigInteger에서 2진수 변환은 하드코딩..

        // 2진수 -> 10진수
        BigInteger n = new BigInteger(br.readLine(),2);
        // 10진수 * 17배
        n = n.multiply(BigInteger.valueOf(17));

        // 10진수 -> 2진수
        StringBuilder sb =new StringBuilder();
        while (true) {
              sb.append(n.remainder(BigInteger.valueOf(2)));
              n = n.divide(BigInteger.valueOf(2));
              if (n.equals(BigInteger.ONE)) {
                  sb.append(n);
                  break;
              }
          }
        System.out.println(sb.reverse());
        br.close();
    }
}
