package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2446 {
    // 백준 2446. 별 찍기 -9
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        // 역 피라미드
        for(int i=0; i<n; i++){
            for(int k=0; k<i; k++){
                sb.append(" ");
            }
            for(int j=0; j<(n*2-1)-i*2; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        // 피라미드
        for(int i=0; i<n-1; i++){ // 3 5 7 9
            for(int k=0; k<n-2-i; k++){
                sb.append(" ");
            }
            for(int j=0; j<3+2*i; j++){
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
