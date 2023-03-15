package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon5343 {
    // 백준 5343. Parity Bit
    public static void main(String[] args) throws IOException {
        // 짝수 패리티(Even Parity) 0, 홀수 패리티(Odd) 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++){
            String s = br.readLine();
            int sum=0;
            for(int j=0; j<7; j++){
                if (s.charAt(j) == '1') {
                    sum++;
                }
            }
            System.out.println(sum%2==0? 0:1);
        }
    }
}
