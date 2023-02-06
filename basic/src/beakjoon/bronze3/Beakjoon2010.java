package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2010 {
    // 백준 2010. 플러그
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum=0;
        for(int i=0; i<n; i++){
            sum += Integer.parseInt(br.readLine());
        }
        System.out.println(sum-(n-1));
    }
}
