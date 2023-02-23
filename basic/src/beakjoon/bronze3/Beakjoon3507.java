package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon3507 {
    // 백준 3507. Automated Telephone Exchange
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ATE = Integer.parseInt(br.readLine());
        int cnt = 0;

        if(ATE <= 198){ // 2자리 수의 최대값 99+99 = 198
            for(int i=1; i<100; i++){
                for(int j=1; j<100; j++){
                    if((i+j) == ATE) cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
