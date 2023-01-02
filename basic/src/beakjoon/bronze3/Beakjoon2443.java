package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2443 {
    // 백준 2443. 별 찍기 -6
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        /*

         *********
          *******
           *****
            ***
             *

         */
        for(int i=0; i<n; i++){
            for(int h=0; h<i; h++){
                System.out.print(" ");
            } // 0 1 3
            for(int j=0; j<(n*2-1)-(i*2); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
