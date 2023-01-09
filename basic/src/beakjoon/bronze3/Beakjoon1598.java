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
        int w = Math.abs((a-1)/4-(b-1)/4);
        int h = Math.abs((a-1)%4-(b-1)%4);

        System.out.println(h+w);
    }
}
