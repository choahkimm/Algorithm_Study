package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2903 {
    // 백준 2903. 중앙 이동 알고리즘
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        int points = 0;
        for(int i=0; i<n; i++){
            points += (int)(Math.pow(2,i));
        }
        System.out.println((2+points) * (2+points));
    }
}
