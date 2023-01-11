package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Beakjoon2061 {
    // 백준 2061. 좋은 암호
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

//        BigInteger K = BigInteger.valueOf(Long.parseLong(st.nextToken()));
        BigInteger K = new BigInteger(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        if(K.divide(BigInteger.valueOf(L)).compareTo(BigInteger.valueOf(L))=='1'){
            System.out.println("GOOD");
        }else{
            System.out.println("BAD " + K.divide(BigInteger.valueOf(L)));
        }

    }
}
