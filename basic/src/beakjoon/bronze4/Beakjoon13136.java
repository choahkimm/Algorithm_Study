package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon13136 {
    // 백준 13136. Do Not Touch Anything
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long r = Integer.parseInt(st.nextToken());
        long c = Integer.parseInt(st.nextToken());
        long n = Integer.parseInt(st.nextToken());

        // 길이 조심 int(x) long(o)
        // 변의 길이가 남으면 cctv가 더 필요하니까 나머지가 있으면 1을 더해줌
        System.out.println((r/n + (r%n>0? 1:0)) * ((c/n) + (c%n>0? 1:0)));
    }
}
