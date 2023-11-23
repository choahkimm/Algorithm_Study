package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2884 {
    // 백준 2884. 알람 시계
    public static void main(String[] args) throws IOException {
        // input 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 연산 처리 - 45분 일찍 설정
        if(m<45) {
            m += 60;
            h = h-1;
        }
        System.out.println((h<0)? (h+24) + " " + (m-45) : h + " " + (m-45));
    }
}
