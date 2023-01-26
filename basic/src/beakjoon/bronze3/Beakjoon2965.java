package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2965 {
    // 백준 2965. 캥거루 세 마리
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        // 캥거루 a~b 거리와 b~c 거리
        int ab = Math.abs(a-b);
        int bc = Math.abs(b-c);

        // 넓은 쪽으로 캥거루가 점프
        System.out.println(ab>bc? ab-1: bc-1);
    }
}
