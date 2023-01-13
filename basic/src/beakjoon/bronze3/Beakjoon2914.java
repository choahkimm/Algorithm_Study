package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2914 {
    // 백준 2914. 저작권
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); // 수록된 곡
        int b = Integer.parseInt(st.nextToken()); // 평균값 (= 앨범 멜로디 개수 / 앨범 수록곡 개수)

        int melody = (b-1)*a;

        System.out.println(melody+1);
    }
}
