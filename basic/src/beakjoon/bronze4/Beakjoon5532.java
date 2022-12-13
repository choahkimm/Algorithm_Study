package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon5532 {
    // 백준 5532. 방학 숙제
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine()); // 방학
        int A = Integer.parseInt(br.readLine()); // 국어 총 페이지
        int B = Integer.parseInt(br.readLine()); // 수학 총 페이지
        int C = Integer.parseInt(br.readLine()); // 하루 풀 수 있는 국어
        int D = Integer.parseInt(br.readLine()); // 하루 풀 수 있는 수학

        int Ad = (A%C==0)? A/C : A/C+1;
        int Bd = (B%D==0)? B/D : B/D+1;
        System.out.println(L-Math.max(Ad,Bd));

    }
}
