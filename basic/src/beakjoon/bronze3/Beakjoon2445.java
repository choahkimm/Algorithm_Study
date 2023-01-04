package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2445 {
    // 백준 2445. 별 찍기 -8
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            for(int a=0; a<i+1; a++){
                sb.append("*");
            }
            for(int b=0; b<2*(n-1)-2*i; b++){
                sb.append(" ");
            }
            for(int a=0; a<i+1; a++){
                sb.append("*");
            }
            sb.append("\n");
        }

        for(int i=n-1; i>=1; i--){  //  4 3 2 1
            for(int a=1; a<=i; a++){
                sb.append("*");
            }
            for(int b=1; b<= 2*n - i*2; b++){
                sb.append(" ");
            }
            for(int c=1; c<=i; c++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
