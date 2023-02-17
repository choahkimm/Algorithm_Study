package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon4806 {
    // 백준 4806. 줄 세기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt =0;
        while (br.readLine() != null){
            cnt++;
        }
        System.out.println(cnt);
    }
}
