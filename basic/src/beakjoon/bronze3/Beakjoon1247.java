package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Beakjoon1247 {
    // 백준 1247. 부호
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = 3;

        for(int i=0; i<testCase; i++){
            int n = Integer.parseInt(br.readLine());
            BigInteger b = new BigInteger("0");

            for(int j=0; j<n; j++){
                BigInteger input = new BigInteger(br.readLine());
                b= b.add(input);
            }

            switch (b.compareTo(BigInteger.ZERO)) {
                case 0:
                    System.out.println("0");
                    break;
                case -1:
                    System.out.println("-");
                    break;
                case 1:
                    System.out.println("+");
                    break;
            }
            //CompareTo 비교값 == -1이면 음수 ==1이면 양수 == 0 이면 0
        }


    }
}
