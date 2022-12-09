package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon10156 {
    // 백준 10156. 과자
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int price = Integer.parseInt(st.nextToken());
        int cnt = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());
        int answer = (price*cnt)-money;
        System.out.println((answer)<0? 0 : answer);
    }
}
