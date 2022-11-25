package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon24883 {
    // 백준 24883. 자동완성
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        System.out.println((N.equals("N")|| N.equals("n"))? "Naver D2" : "Naver Whale");
    }
}
