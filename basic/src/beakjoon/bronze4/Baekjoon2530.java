package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2530 {
    // 백준 2530. 인공지능 시계
    public static void main(String[] args) throws IOException {
        // 현재 시간, 필요한 시간
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int needTime = Integer.parseInt(br.readLine());

        int time = h*60*60 + m*60 + s + needTime;

        int H = (time/(60*60)==24)? 0 : time/(60*60);
        int M = (time%(60*60)/60==60)? 0 :time%(60*60)/60;
        int S = (time%(60*60)%60==60)? 0 :time%(60*60)%60;

        System.out.println( H + " " + M + " " + S);
        br.close();
    }
}
