package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon1598 {
    // 백준 1598. 꼬리를 무는 숫자 나열
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int w = Math.abs(a/4-b/4);

        switch (a/4){
            case 0 : a=4; break;
            case 1 : a=1; break;
            case 2 : a=2; break;
            case 3 : a=3; break;
        }
        switch (b/4){
            case 0 : b=4; break;
            case 1 : b=1; break;
            case 2 : b=2; break;
            case 3 : b=3; break;
        }

        int h = Math.abs(a-b);

        System.out.println(h+w);

    }
}
