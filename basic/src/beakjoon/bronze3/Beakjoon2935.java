package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Beakjoon2935 {
    // 백준 2935. 소음
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger(br.readLine());
        String sign  = br.readLine();
        BigInteger b = new BigInteger(br.readLine());

        if(sign.equals("*"))
            System.out.println(a.multiply(b));
        else if(sign.equals("+"))
            System.out.println(a.add(b));
    }
}
