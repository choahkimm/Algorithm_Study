package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2523 {
    // 백준 2523. 별 찍기 -13
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
