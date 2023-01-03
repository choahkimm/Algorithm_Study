package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2444 {
    // 백준 2444. 별 찍기 -7
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<(i*2)+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0; i<n-1; i++){
            for(int j=1; j<i+2; j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*(n-1-i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
