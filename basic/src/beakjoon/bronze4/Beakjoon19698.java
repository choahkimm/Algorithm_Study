package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon19698 {
    // 백준 19698. 헛간 청약
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st =new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 소들의 수
        int w = Integer.parseInt(st.nextToken()); // 헛간 너비
        int h = Integer.parseInt(st.nextToken()); // 헛간 높이
        int l = Integer.parseInt(st.nextToken()); // 소들에게 배정되는 크기

        // 방보다 소가 적다면 최대 입주 수는 소들의 수
        System.out.println(Math.min((w/l)*(h/l),n) );
    }
}
