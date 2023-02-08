package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Beakjoon2061_c {
    // 백준 2061. 좋은 암호
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger K = new BigInteger(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int n = 0;
        for(int i=2; i<L; i++){
            // K와 i를 비교한 나머지가 0인지 아닌지를 판별
            if(K.remainder(BigInteger.valueOf(i)).compareTo(BigInteger.ZERO)==0){
              n=i;
              break;
            }
        }
        System.out.println((n>0)? "BAD " + n : "GOOD" );
    }
}
